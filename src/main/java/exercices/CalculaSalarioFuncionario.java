package exercices;

import entities.Funcionario;
import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class CalculaSalarioFuncionario {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do funcionário: ");
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double tax = sc.nextDouble();

        Funcionario f = new Funcionario();
        f.setName(name);
        f.setGrossSalary(salary);
        f.setTax(tax);

        System.out.println("Employee " + f.netSalary());

        System.out.print("Which percentage to increase salary? :");
        double increase = sc.nextDouble();
        f.increaseSalary(increase);
        System.out.println("Update data: " + f.netSalary());


        sc.close();
    }
}
