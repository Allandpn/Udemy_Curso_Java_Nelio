package s18.application;

import s18.entities.Produto2;
import s18.utils.ProductConsumer;
import s18.utils.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AppConsumerProducts {
    public static void main(String args[]) {
        List<Produto2> list = new ArrayList<>(
                List.of(
                        new Produto2("tv", 1300.00),
                        new Produto2("sofa", 1550.00),
                        new Produto2("mesa", 1400.00),
                        new Produto2("mesa", 1600.00)
                )
        );

        Consumer<Produto2> consum1 = p -> p.setPrice(p.getPrice() * 1.1);

        list.forEach(new ProductConsumer());

        list.forEach(Produto2::staticConsumerProduct);

        list.forEach(Produto2::nonStaticConsumerProduct);

        list.forEach(consum1);

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);

    }
}
