package com.github.alissonydev.app;

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

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        System.out.printf("Avaliação média: %.2f%n", meuFilme.getSomaDasAvaliacoes() / meuFilme.getTotalDeAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.getSomaDasAvaliacoes());

        System.out.println(meuFilme.pegaMedia());


    }
}
