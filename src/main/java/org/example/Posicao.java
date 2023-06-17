package org.example;

public class Posicao {

    private String nome;
    private String areaAtuacao;

    public Posicao(String nome, String areaAtuacao) {
        this.nome = nome;
        this.areaAtuacao = areaAtuacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
}