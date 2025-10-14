package com.github.alissonydev.entities.app;

import com.github.alissonydev.entities.Filme;

public class Principal {
    public static void main(String[] args) {

        final Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.genero = "Drama";
        meuFilme.nota = 9.2;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 175;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
    }
}
