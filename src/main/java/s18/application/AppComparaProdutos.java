package s18.application;
import s18.entities.Produto;
import s18.utils.ComparatorProduct;

import java.util.*;

public class AppComparaProdutos {
    public static void main(String args[]){
        List<Produto> list = new ArrayList<>(
                List.of(
                        new Produto("tv", 1300.00),
                        new Produto("sofa", 1500.00),
                        new Produto("mesa", 1400.00)
                )
        );

        System.out.println("Lista ordenada por Preco: ");

        list.sort(new ComparatorProduct());

        for(Produto p : list){
            System.out.println(p.getName() + " - " + p.getPrice());
        }

        Comparator<Produto> comparatorProduct = new Comparator<Produto>(){
            @Override
            public int compare(Produto p1, Produto p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        Comparator<Produto> compName = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        Comparator<Produto> compName2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());


        System.out.println("\nLista ordenada por Nome: ");

        list.sort(compName2);

        for(Produto p : list){
            System.out.println(p.getName() + " - " + p.getPrice());
        }

        System.out.println("\nLista ordenada por Preco: ");

        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        for(Produto p : list){
            System.out.println(p.getName() + " - " + p.getPrice());
        }
    }
}
