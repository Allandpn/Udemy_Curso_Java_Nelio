package s13.exercicies;

import s13.entities.Pessoa;
import s13.entities.PessoaFisica;
import s13.entities.PessoaJuridica;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CalculaImposto {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<n; i++){
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)?");
            String tipoPessoa = sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = Double.parseDouble(sc.nextLine());
            switch (tipoPessoa){
                case "i":
                    System.out.print("Health expenditures: ");
                    double gastoSaude = Double.parseDouble(sc.nextLine());
                    pessoas.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
                    break;
                case "c":
                    System.out.print("Number of employees: ");
                    int numeroFuncionarios = Integer.parseInt(sc.nextLine());
                    pessoas.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
                    break;
                default:
                    System.out.println("Number incorrect!");
                    i--;
            }
        }
        System.out.println("\nTAXES PAID:");
        for(Pessoa p : pessoas){
            System.out.println(p);
        }
        sc.close();
    }
}
