package s17.application;

import s17.entities.Entities;
import s17.entities.Product;
import s17.entities.Students;
import s17.services.CreateListEntities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CreateSet {
    public static void main(String[] args){

        String products_dir = "s17/data/ListProducts.csv";
        String students_dir = "s17/data/ListStudents.csv";

        List<Product> products = CreateListEntities.createList(products_dir, line -> new Product(line[0], Double.parseDouble(line[1])));
        List<Students> students = CreateListEntities.createList(students_dir, line -> new Students(line[0], Double.parseDouble(line[1])));

        Set<Students> setStudents = new TreeSet<>(students);

        Set<Product> setProducts = new HashSet<>(products);

        for(Students s: setStudents){
            System.out.println(s.toString());
        }

//        for(Product p: setProducts){
//            System.out.println(p.toString());
//        }



        System.out.println("----UNION----");
        Set<Students> setStudents2 = new TreeSet<>(students);

        setStudents.removeIf(x -> x.getName().charAt(0) == 'A');

        Set<Students> setStudents3 = new TreeSet<>(setStudents2);

        setStudents3.addAll(setStudents);

        for(Students s: setStudents3){
            System.out.println(s.toString());
        }

        System.out.println("----INTERSECTION----");
        Set<Students> setStudents4 = new TreeSet<>(students);
        setStudents4.retainAll(setStudents2);
        for(Students s: setStudents4){
            System.out.println(s.toString());
        }


        System.out.println("----DIFFERENCE----");
        Set<Students> setStudents5 = new TreeSet<>(setStudents2);
        setStudents5.removeAll(students);
        for(Students s: setStudents5){
            System.out.println(s.toString());
        }

        System.out.println("----CONTAINS----");
        Students s1 = students.getFirst();
        System.out.println(setStudents2.contains(s1));
    }
}
