package s13.exercicies;

import s13.entities.Circle;
import s13.entities.Rectangle;
import s13.entities.Shape;
import s13.enums.Color;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CreateShape {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i<n; i++){
            System.out.println("Shape #" + (i+1) + " data:");
            System.out.print("Retangle or Circle: (r/c)");
            String shape = sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());
            switch (shape){
            case "c":
                System.out.print("Radius: ");
                double radius = Double.parseDouble(sc.nextLine());
                shapes.add(new Circle(radius, color));
                break;
            case "r":
                System.out.print("Width: ");
                double width = Double.parseDouble(sc.nextLine());
                System.out.print("Height: ");
                double height = Double.parseDouble(sc.nextLine());
                shapes.add(new Rectangle(width, height, color));
            }
        }

        System.out.println("\nSHAPE AREAS: ");
        for(Shape s : shapes){
            System.out.println(nf.format(s.area()) + " - " + s.getColor());
        }
        sc.close();
    }
}
