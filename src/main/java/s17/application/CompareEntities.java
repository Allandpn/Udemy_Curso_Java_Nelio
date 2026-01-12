package s17.application;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class CompareEntities {
    public static <T extends Comparable<? super T>> List<T> orderList(List<T> list) {
        return list
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

    }

}
