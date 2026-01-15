package s18.utils;

import s18.entities.Produto2;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Produto2> {
    @Override
    public void accept(Produto2 p2) {
        p2.setPrice(p2.getPrice() * 1.1);
    }
}
