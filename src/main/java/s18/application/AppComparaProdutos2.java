package s18.application;

import s18.entities.Produto2;
import s18.utils.ComparatorProduct2;

import java.util.*;

public class AppComparaProdutos2 {
    public static void main(String args[]){
        List<Produto2> list = new ArrayList<>(
                List.of(
                        new Produto2("tv", 1300.00),
                        new Produto2("sofa", 1500.00),
                        new Produto2("mesa", 1400.00)
                )
        );

        Comparator<Produto2> comp1 = new ComparatorProduct2();

        Comparator<Produto2> comp2 = new Comparator<Produto2>() {
            @Override
            public int compare(Produto2 p1, Produto2 p2){
                return p1.getPrice().compareTo(p2.getPrice());
            }
        };

        Comparator<Produto2> comp3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        System.out.println("\nLista ordenada por Nome: ");
        list.sort(comp1);
        for(Produto2 p : list){
            System.out.println(p.getName() + " - " + p.getPrice());
        }

        System.out.println("\nLista ordenada por Preco: ");
        list.sort(comp2);
        for(Produto2 p : list) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }

        System.out.println("\nLista ordenada por Nome: ");
        list.sort(comp3);
        for(Produto2 p : list){
            System.out.println(p.getName() + " - " + p.getPrice());

        }

        System.out.println("\nLista ordenada por Preco: ");
        list.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));
        for(Produto2 p : list){
            System.out.println(p.getName() + " - " + p.getPrice());
        }
    }
}
