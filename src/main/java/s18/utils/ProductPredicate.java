package s18.utils;

import s18.entities.Produto2;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Produto2> {
    @Override
    public boolean test(Produto2 p) {
        return p.getPrice() > 1500.0;
    }
}
