package exercicios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CadastroDeFuncionarios {

    private Set<Funcionario> cadastro;

    public CadastroDeFuncionarios() {
        cadastro = new HashSet<>();
    }

    public void cadastrar(Funcionario funcionario) {
        if (cadastro.contains(funcionario)) {
            System.out.println("funcionario ja esta cadastrado");
        } else {
            cadastro.add(funcionario);
        }
    }

    public void buscar(Funcionario funcionario) {
        if (cadastro.contains(funcionario)) {
            System.out.println("funcionario: " + funcionario.getNome() + " esta cadastrado");
        } else {
            System.out.println("funcionario não esta cadastrado");
        }
    }

    public void removerFuncionario(Funcionario funcionario) {
        if (cadastro.contains(funcionario)) {
            cadastro.remove(funcionario);
        } else {
            System.out.println("funcionario não esta cadastrado");
        }
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : cadastro) {
            System.out.println("funcionario: " + funcionario.getNome() + ", salario: " + funcionario.getSalario());
        }
    }
}
