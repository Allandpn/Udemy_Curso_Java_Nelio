package entities;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    private String name;
    private double grossSalary;
    private double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percent) {
        this.grossSalary += this.grossSalary * (percent/100);
    }

    public String toString() {
        return this.name + ", $ " + this.grossSalary;
    }
}
