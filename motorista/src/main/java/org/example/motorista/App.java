package org.example.motorista;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run() {
        List<Passageiro> passageiros = Arrays.asList(
                new Passageiro("joao", 6.7, 17),
                new Passageiro("pedro", 3.1, 11),
                new Passageiro("maria", 3.0, 34));
        Motorista motorista = new Motorista(passageiros);

        System.out.println("O motorista deve receber: " + motorista.valorReceber());
    }
}
