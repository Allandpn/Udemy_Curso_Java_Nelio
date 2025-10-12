package exercices;

import entities.Triangulo;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();



        System.out.println("Digite as medidas do primeiro triangulo");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do segundo triangulo");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double area_1 = x.calculaArea();
        double area_2 = y.calculaArea();

        System.out.printf("Triangle X area: %.4f%n", area_1);
        System.out.printf("Triangle Y area: %.4f%n", area_2);

        if (area_1 > area_2) {
            System.out.println("Lager area: X");
        } else
        {
            System.out.println("Lager area: Y");
        }

        sc.close();

    }



}
