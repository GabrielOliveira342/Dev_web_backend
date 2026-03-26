package com.aulaback.aula.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aulaback.aula.domain.Cliente;
import com.aulaback.aula.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    @GetMapping
    public List<Cliente> listar() {
        return repository.findAll();
    }

   
    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        Optional<Cliente> cliente = repository.findById(id);
        return cliente.orElse(null); 
    }

    
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        repository.deleteById(id);
        return "Cliente removido com sucesso!";
    }

    
    @GetMapping("/buscarPorNome")
    public List<Cliente> buscarPorNome(@RequestParam String nome) {
        return repository.findByNome(nome);
    }

  
    @GetMapping("/buscarPorEmail")
    public Cliente buscarPorEmail(@RequestParam String email) {
        Optional<Cliente> cliente = repository.findByEmail(email);
        return cliente.orElse(null);
    }
}