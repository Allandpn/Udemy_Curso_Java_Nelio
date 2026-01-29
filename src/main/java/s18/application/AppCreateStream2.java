package s18.application;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AppCreateStream2 {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(st1.toList());

        Stream<String> st2 = Stream.of("Eu", "Foo", "Boo", "Too");

        System.out.println(st2.toList());

        Stream<Integer> st3 = Stream.iterate(1, x -> x < 100 , x -> x * 2);

        System.out.println(st3.toList());

        Stream<Long> st4 = Stream.iterate(new Long[] {0L,1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);

        System.out.println(st4.limit(1000).toList());

        List<Integer> list5 = Arrays.asList(1,2,4,6,7,89,3,45);

        int st6 = list5.stream().filter(x -> x % 2 == 0).map(x -> x * 10).reduce(0, Integer::sum);

        System.out.println(st6);
    }
}
