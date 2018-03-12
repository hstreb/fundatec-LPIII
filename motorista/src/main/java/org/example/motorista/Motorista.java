package org.example.motorista;

import java.util.List;

public class Motorista {

    private List<Passageiro> passageiros;

    public Motorista(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public Double valorReceber() {
        Double resultado = 0.0;

        for (int i = 0; i < passageiros.size(); i++) {
            Passageiro passageiro = passageiros.get(i);
            resultado += passageiro.getKmRodado() * 0.2 + passageiro.getMinutos() * 0.5;
        }
        return  resultado;
    }
}
