package org.example.motorista;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MotoristaTest {

    @Test
    public void deveReceberZeroQuandoNaoTransportouNinguem() {
        Motorista motorista = new Motorista(new ArrayList<>());

        Double esperado = 0.0;
        Double valorReceber = motorista.valorReceber();

        assertEquals(esperado, valorReceber);
    }

    @Test
    public void deveReceberQuandoTransportouAlguem() {
        Motorista motorista = new Motorista(Arrays.asList(new Passageiro("joao", 6.7, 17)));

        Double esperado = 9.84;
        Double valorReceber = motorista.valorReceber();

        assertEquals(esperado, valorReceber);
    }

}