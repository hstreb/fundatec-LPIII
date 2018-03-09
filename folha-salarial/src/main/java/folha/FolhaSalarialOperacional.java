package folha;

public class FolhaSalarialOperacional implements FolhaSalarial {

    private FuncionarioDao funcionarioDao;

    public FolhaSalarialOperacional(FuncionarioDao funcionarioDao) {
        this.funcionarioDao = funcionarioDao;
    }

    @Override
    public Double calcularSalario(String nome, int horas) {
        Funcionario funcionario = funcionarioDao.buscarPorNome(nome);
        if (funcionario == null) {
            return 0.0;
        }
        return calcularSalarioNormal(horas, funcionario)
                + calcularHorasExtras(horas, funcionario);
    }

    private Double calcularHorasExtras(int horas, Funcionario funcionario) {
        return contarHorasExtras(horas) * funcionario.getCargo().getSalarioPorHora() * 0.5;
    }

    private double calcularSalarioNormal(int horas, Funcionario funcionario) {
        return funcionario.getCargo().getSalarioPorHora() * horas;
    }

    private int contarHorasExtras(int horas) {
        return horas > Cargo.CARGA_HORARIA ? horas - Cargo.CARGA_HORARIA : 0;
    }
}
