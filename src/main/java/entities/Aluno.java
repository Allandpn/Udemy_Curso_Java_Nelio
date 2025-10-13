package entities;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    private String name;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaFinal;
    private String status;

    public void calculaNotaFinal(){
        this.notaFinal = this.nota1 + this.nota2 + this.nota3;
    }

    public void verificaStatusAluno() {
        this.status = (this.notaFinal >= 60) ? "PASS" : "FAILED";
    }

    public double calculaPontosRestantes() {
        return (this.notaFinal < 60) ? 60 - this.notaFinal : 0;
    }

    public String toString(){
        return "FINAL GRADE = " + this.notaFinal + "\n" + this.status;
    }





}
