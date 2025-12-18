package s14.exercicies;

import s14.entities.Account;
import s14.exceptions.AccountExceptions;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CreateAccount {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Enter account data");
        try{
            System.out.print("Number: ");
            int number = Integer.parseInt(sc.nextLine());
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = Double.parseDouble(sc.nextLine());
            System.out.print("Withdraw limit: ");
            double withdraw = Double.parseDouble(sc.nextLine());
            Account account = new Account(number, holder, balance, withdraw);

            System.out.print("\nEnter amount for withdraw: ");
            account.withdraw(Double.parseDouble(sc.nextLine()));

            System.out.println("New balance: " + nf.format(account.getBalance()));
        }
        catch (AccountExceptions e) {
            System.out.println("Error: " + e.getMessage());
        };
        sc.close();

    }
}
