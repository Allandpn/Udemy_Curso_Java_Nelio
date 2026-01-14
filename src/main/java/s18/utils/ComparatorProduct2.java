package s18.utils;

import s18.entities.Produto;
import s18.entities.Produto2;

import java.util.Comparator;
import java.util.Locale;

public class ComparatorProduct2 implements Comparator<Produto2> {

    @Override
    public int compare(Produto2 o1, Produto2 o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
