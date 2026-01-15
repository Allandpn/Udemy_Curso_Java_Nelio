package s18.utils;

import s18.entities.Produto2;

import java.util.function.Function;

public class ProductFunction implements Function<Produto2, String> {
    @Override
    public String apply(Produto2 p) {
        return p.getName().toUpperCase();
    }
}
