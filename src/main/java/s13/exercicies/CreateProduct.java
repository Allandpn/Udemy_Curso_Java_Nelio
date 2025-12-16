package s13.exercicies;

import s13.entities.ImportedProduct;
import s13.entities.Product;
import s13.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CreateProduct {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number od products: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char x = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = Double.parseDouble(sc.nextLine());
            switch (x) {
                case 'c':
                    products.add(new Product(name, price));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String dateString = sc.nextLine();
                    LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    products.add(new UsedProduct(name, price, date));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = Double.parseDouble(sc.nextLine());
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
            }
        }

        System.out.println("PRICE TAGS:");
        for(Product p : products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
