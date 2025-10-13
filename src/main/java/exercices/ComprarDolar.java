package exercices;


import Utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ComprarDolar {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double qnt = sc.nextDouble();
        System.out.println("Amount to be paid in reais =  " + String.format("%.2f", CurrencyConverter.calculaValorCompra(dollar, qnt)));


        sc.close();
    }
}
