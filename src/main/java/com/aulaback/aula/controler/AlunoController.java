package com.aulaback.aula.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.aulaback.aula.domain.Aluno;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();

    @GetMapping
    public List<Aluno> lista() {
        return alunos;
    }

    @PostMapping
    public Aluno addAlunos(@RequestBody @Valid Aluno aluno) {
        alunos.add(aluno);
        return aluno;
    }

    @PutMapping("/{ra}")
    public Aluno putAluno(@PathVariable int ra, @RequestBody Aluno alunoAtualizado) {

        for (Aluno aluno : alunos) {
            if (aluno.getRa() == ra) {
                aluno.setNome(alunoAtualizado.getNome());
                aluno.setEmail(alunoAtualizado.getEmail());
                return aluno;
            }
        }

        return null;
    }
    
     @DeleteMapping("/{ra}")
    public String deleteAluno(@PathVariable int ra) {

        for (Aluno aluno : alunos) {
            if (aluno.getRa() == ra) {
                alunos.remove(aluno);
                return "Aluno removido com sucesso";
            }
        }

        return "Aluno não encontrado";
    }

}