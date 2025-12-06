package s10.exercicies;

import s10.entities.Funcionario;
import s10.entities.Empresa;
import java.util.Locale;
import java.util.Scanner;

public class RegistroFuncinarios {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();
        Empresa empresa = new Empresa();
        for(int i = 0; i < n; i++){
            System.out.println("Type id of Funcionary: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            if(empresa.buscarFuncionario(id) != null){
                System.out.println("Ja existe funcioanario com esse ID");
                i--;
                continue;
            }
            System.out.println("Type name of Funcionary: ");
            String name = sc.nextLine();
            System.out.println("Type salary of Funcionary: ");
            Double salary = sc.nextDouble();
            Funcionario funcionario = new Funcionario(id, name, salary);
            empresa.addFuncionarios(funcionario);
        }

        System.out.println("Digite o id do funcionario: ");
        int id = sc.nextInt();
        System.out.println("Digite o valor do aumento: ");
        Double x = sc.nextDouble();
        sc.nextLine();

        Funcionario funcionarioX = empresa.buscarFuncionario(id);
        if(funcionarioX != null){
            funcionarioX.increaseSalario(x);
        } else {
            System.out.println("Não há funcionario com esse ID");
        }

        System.out.println(empresa);
    }
}
