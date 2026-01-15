package s18.utils;

import s18.entities.Produto2;

import java.util.List;
import java.util.function.Predicate;

public class FilterProductFunction {
    public static double filterSum(List<Produto2> list, Predicate<Produto2> crit) {
        double sum = 0;
        for(Produto2 p: list){
            if(crit.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
