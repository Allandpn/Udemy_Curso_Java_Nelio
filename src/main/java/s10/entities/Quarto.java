package s10.entities;

import lombok.AllArgsConstructor;
import s10.entities.Estudante;
import lombok.Data;

@AllArgsConstructor
@Data
public class Quarto {
    private int numero;
    private Estudante hospede;


    public boolean isOcupado(){
        return this.hospede != null;
    }

}
