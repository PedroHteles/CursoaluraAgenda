package com.example.aluraagenda.model;

public class Aluno {
    private final String nome;
    private final String telefone;
    private final String email;

    public Aluno(String nome, String email, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;
    }
}
