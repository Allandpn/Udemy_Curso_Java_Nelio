package exercices;

import entities.Conta;
import java.util.Scanner;

public class CriarContaBancaria {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String nome = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n): ");
        char isDeposit = sc.next().charAt(0);

        Conta conta;
        if(isDeposit == 'y'){
            System.out.print("Enter inital deposit value: ");
            double saldo = sc.nextDouble();
            conta = new Conta(numeroConta, nome, saldo);
        } else {
            conta = new Conta(numeroConta, nome);
        }
        System.out.println("\nAccount data: ");
        System.out.println(conta);
        System.out.print("\nEnter a deposit value: ");
        double value = sc.nextDouble();
        conta.deposit(value);
        System.out.println("\nUpdate account data: ");
        System.out.println(conta);
        System.out.print("\nEnter a withdraw value: ");
        double valueDraw = sc.nextDouble();
        conta.withdraw(valueDraw);
        System.out.println("\nUpdate account data: ");
        System.out.println(conta);

        sc.close();
    }

}
