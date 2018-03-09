package folha;

public class Cargo {

    public static final int CARGA_HORARIA = 180;

    private String nome;
    private Double salario;

    public Cargo(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getSalarioPorHora() {
        return salario / CARGA_HORARIA;
    }
}
