package s10.exercicies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicieList {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();

        list.add("All");
        list.add("Foo");
        list.add("Boo");
        list.add("Bll");
        list.add("Too");
        list.add("Alm");

        System.out.println(list.size());
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("------------------------");
        list.removeIf(x -> x.charAt(0) == 'A');
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("------------------------");
        list.indexOf("Boo");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').toList();
        for(String x : result){
            System.out.println(x);
        }
        System.out.println("------------------------");
        String name = list.stream().filter(x -> x.startsWith("B")).findFirst().orElse(null);
        System.out.println(name);
    }
}
