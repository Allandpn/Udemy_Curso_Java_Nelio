package exercices;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class CalculaRetangulo {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Retangulo rectangle = new Retangulo();
        System.out.println(rectangle);
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        rectangle.calculaArea();
        rectangle.calculaDiagonal();
        rectangle.calculaPerimetro();
        System.out.println(rectangle);

        sc.close();
    }
}
