package com.aulaback.aula.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaback.aula.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    
    Optional<Cliente> findByEmail(String email);

    
    List<Cliente> findByNome(String nome);

    
    List<Cliente> findByNomeStartingWith(String nome);
}