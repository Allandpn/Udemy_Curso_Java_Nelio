package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Retangulo {
    private double width;
    private double height;
    private double area;
    private double perimetro;
    private double diagonal;


    public double calculaArea() {
        this.area = this.width * this.height;
        return this.area;
    }

    public double calculaPerimetro() {
        this.perimetro = (this.height * 2) + (this.width * 2);
        return perimetro;
    }

    public double calculaDiagonal() {
        this.diagonal = Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
        return diagonal;
    }

    public String toString() {
        return
                "AREA = "
                + this.area
                + "\nPERIMETER = "
                + this.perimetro
                + "\nDIAGONAL = "
                + this.diagonal;
    }

}
