package s10.entities;

import s10.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    public void addFuncionarios(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Funcionario buscarFuncionario(Integer id) {
        return funcionarios.stream().filter(f -> f.getId().equals(id)).findFirst().orElse(null);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        int cont = 1;
        for(Funcionario funcionario : funcionarios){
            sb.append("Emplyoee #")
                    .append(cont)
                    .append("\nId: ")
                    .append(funcionario.getId())
                    .append("\nName: ")
                    .append(funcionario.getNome())
                    .append("\nSalary: ")
                    .append(funcionario.getSalario())
                    .append("\n\n");
        }
        return sb.toString();
    }
}
