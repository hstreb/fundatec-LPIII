package org.example.motorista;

public class Passageiro {
    private String nome;
    private Double kmRodado;
    private int minutos;

    public Passageiro(String nome, Double kmRodado, int minutos) {
        this.nome = nome;
        this.kmRodado = kmRodado;
        this.minutos = minutos;
    }

    public String getNome() {
        return nome;
    }

    public Double getKmRodado() {
        return kmRodado;
    }

    public int getMinutos() {
        return minutos;
    }
}
