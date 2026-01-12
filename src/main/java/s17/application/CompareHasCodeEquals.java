package s17.application;

import s17.entities.Product;
import s17.entities.Students;
import s17.services.ConvertToList;
import s17.services.ReadData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompareHasCodeEquals {
    public static void main(String args[]) throws IOException {

        String products_dir = "s17/data/ListProducts.csv";
        String students_dir = "s17/data/ListStudents.csv";

        List<String> listProducts = ConvertToList.toList(ReadData.readList(products_dir));
        List<String> listStudents = ConvertToList.toList(ReadData.readList(students_dir));

        List<Product> products = new ArrayList<>();
        List<Students> students = new ArrayList<>();

        String[] line;
        for (String l : listProducts) {
            line = l.split(",");
            Product p = new Product(line[0], Double.parseDouble(line[1]));
            products.add(p);
        }

        for (String l : listStudents) {
            line = l.split(",");
            Students p = new Students(line[0], Double.parseDouble(line[1]));
            students.add(p);
        }

        Students s1 = students.getFirst();
        Students s2 = students.getLast();

        Product p1 = products.getFirst();
        Product p2 = products.getLast();

        System.out.println(p1.equals(p1));
        System.out.println(s1.hashCode() == s2.hashCode());

    }

}
