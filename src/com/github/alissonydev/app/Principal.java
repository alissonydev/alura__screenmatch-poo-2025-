package com.github.alissonydev.app;

import com.github.alissonydev.entities.Filme;
import com.github.alissonydev.entities.Serie;
import com.github.alissonydev.utils.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {

        final Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setGenero("Drama");
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(175);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        System.out.printf("Avaliação média: %.2f%n", meuFilme.getSomaDasAvaliacoes() / meuFilme.getTotalDeAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.getSomaDasAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

        final Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        System.out.println();
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        final Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setGenero("Ficcao");
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDuracaoEmMinutos(200);

        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());
    }
}
