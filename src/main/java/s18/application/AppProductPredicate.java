package s18.application;

import s18.entities.Produto2;
import s18.utils.ComparatorProduct2;
import s18.utils.ProductPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class AppProductPredicate {
    public static void main(String args[]) {
        List<Produto2> list = new ArrayList<>(
                List.of(
                        new Produto2("tv", 1300.00),
                        new Produto2("sofa", 1550.00),
                        new Produto2("mesa", 1400.00),
                        new Produto2("mesa", 1600.00)
                )
        );

        Predicate<Produto2> pred1 = new ProductPredicate();

        list.removeIf(pred1);

        list.removeIf(Produto2::nonpredicateProduct);

        Predicate<Produto2> pred2 = p -> p.getPrice() >= 1500.0;

        list.removeIf(x -> x.getPrice() >= 1500.0);

        System.out.println("\nLista filtrada: ");
        for (Produto2 p : list) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }
    }
}
