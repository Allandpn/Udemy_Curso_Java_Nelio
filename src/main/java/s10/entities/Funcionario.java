package s10.entities;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public void increaseSalario(Double per){
        salario += salario * (per/100);
    }

    public void decreaseSalario(Double per){
        salario -= salario * (per/100);
    }

}
