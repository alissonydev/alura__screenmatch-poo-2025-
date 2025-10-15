package com.github.alissonydev.entities;

public class Filme {

    public String nome;
    public int anoDeLancamento;
    public String genero;
    public double nota;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }



    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + (incluidoNoPlano ? "Sim" : "Não"));
        System.out.println("Nota do filme: " + nota);
        System.out.println("Avaliação média: " + (totalDeAvaliacoes == 0 ? 0 : somaDasAvaliacoes / totalDeAvaliacoes));
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
