package com.aulaback.aula.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Aluno {

    private int ra;

    @NotBlank(message = "Nome não pode estar vazio")
    private String nome;

    @Email(message = "Email inválido")
    private String email;

    public Aluno() {
    }

    public Aluno(int ra, String nome, String email) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}