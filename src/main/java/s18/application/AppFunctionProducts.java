package s18.application;

import s18.entities.Produto2;
import s18.utils.FilterProductFunction;
import s18.utils.ProductConsumer;
import s18.utils.ProductFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppFunctionProducts {
    public static void main(String args[]) {
        List<Produto2> list = new ArrayList<>(
                List.of(
                        new Produto2("tv", 1300.00),
                        new Produto2("sofa", 1550.00),
                        new Produto2("mesa", 1400.00),
                        new Produto2("mesa", 1600.00),
                        new Produto2("sofa", 1550.00),
                        new Produto2("mesa", 1400.00),
                        new Produto2("mesa", 1600.00)
                )
        );

        Function<Produto2, String> func1 = new ProductFunction();
        Function<Produto2, String> func2 = p -> p.getName().toLowerCase();

        List<String> listString1 =  list.stream().map(func1).toList();

        List<String> listString2 =  list.stream().map(Produto2::nonStaticFunctionProduct).toList();
        List<String> listString3 =  list.stream().map(Produto2::staticFunctionProduct).toList();
        List<String> listString4 =  list.stream().map(p -> p.nonStaticFunctionProduct()).toList();
        List<String> listString5 =  list.stream().map(func2).toList();

        listString1.forEach(System.out::println);
        listString2.forEach(System.out::println);
        listString3.forEach(System.out::println);
        listString4.forEach(System.out::println);
        listString5.forEach(System.out::println);


        double sum = FilterProductFunction.filterSum(list, p -> p.getName().charAt(0) == 's');

        System.out.println(sum);

    }
}
