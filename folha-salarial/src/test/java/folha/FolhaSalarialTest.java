package folha;

import org.junit.Test;

import static org.junit.Assert.*;

public class FolhaSalarialTest {

    private FolhaSalarial folhaSalarial = new FolhaSalarialOperacional(new FuncionarioDaoEmMemoria());

    @Test
    public void naoDeveFazerNadaQuandoNaoEncontrarFuncionario() {
        Double experado = 0.0;
        Double salario = folhaSalarial.calcularSalario("Inexistente", 180);

        assertEquals(experado, salario);
    }

    @Test
    public void deveRetornar1000ParaOperadorCom180Horas() {
        Double experado = 1000.0;
        Double salario = folhaSalarial.calcularSalario("joao", 180);

        assertEquals(experado, salario);
    }

    @Test
    public void deveRetornar2000ParaGerenteCom180Horas() {
        Double experado = 2000.0;
        Double salario = folhaSalarial.calcularSalario("maria", 180);

        assertEquals(experado, salario);
    }

    @Test
    public void deveDescontarSalarioDeQuemTrabalhouMenosDe180Horas() {
        Double experado = 994.4444444444445;
        Double salario = folhaSalarial.calcularSalario("joao", 179);

        assertEquals(experado, salario);
    }

    @Test
    public void devePagarHorasExtrasParaQuemTrabalhouMaisDe180Horas() {
        Double experado = 1008.33333333333334;
        Double salario = folhaSalarial.calcularSalario("joao", 181);

        assertEquals(experado, salario);
    }

}