package folha;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o nome do funcionario:");
        String funcionario = scanner.nextLine();

        System.out.println("digite a quantidade de horas trabalhadas do(a) " + funcionario + ":");
        String horasTrabalhadas = scanner.nextLine();

        FolhaSalarial folhaSalarial = new FolhaSalarialOperacional(new FuncionarioDaoEmMemoria());
        Double salario = folhaSalarial.calcularSalario(funcionario, Integer.decode(horasTrabalhadas));

        String resultado = funcionario + " " + horasTrabalhadas + " " + salario;

        System.out.println(resultado);
    }
}
