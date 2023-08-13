package com.university.api.aluno;

public record DtoCadastroAluno(
        String nome,
        int idade,
        String dataNasc,
        String cpf,
        String rg,
        String mat,
        Turno turno) {

}
