package folha;

import java.util.Arrays;
import java.util.List;

public class FuncionarioDaoEmMemoria implements FuncionarioDao {

    private static final Cargo OPERADOR = new Cargo("operador", 1000.0);
    private static final Cargo GERENTE = new Cargo("gerente", 2000.0);

    private List<Funcionario> funcionarios = Arrays.asList(
            new Funcionario("joao", OPERADOR),
            new Funcionario("pedro", OPERADOR),
            new Funcionario("maria", GERENTE));

    @Override
    public Funcionario buscarPorNome(String nome) {
        for(Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }
        return null;
    }
}
