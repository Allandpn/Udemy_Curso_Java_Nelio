package s18.utils;

import s18.entities.Produto;

import java.util.Comparator;

public class ComparatorProduct implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }
}
