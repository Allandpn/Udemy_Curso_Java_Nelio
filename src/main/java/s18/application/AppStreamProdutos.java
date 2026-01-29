package s18.application;

import s18.entities.Produto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppStreamProdutos {
    public static void main(String args[]){

        List<Produto> produtoList = new ArrayList<>();

        InputStream iS = AppStreamProdutos.class.getClassLoader().getResourceAsStream("s18.data/products.csv");

        if(iS == null){
            throw new IllegalArgumentException();
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(iS))){
            String _line;
            while((_line = br.readLine())!= null){
                String[] line = _line.split(",");
                Produto p = new Produto(line[0], Double.parseDouble(line[1]));
                produtoList.add(p);
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

        Double average = produtoList.stream().map(Produto::getPrice).reduce(0.0, Double::sum) / produtoList.size();

        System.out.println("Average price: " + average);

        Comparator<String> comp1 = (s1, s2 )-> s1.toUpperCase().compareTo(s2.toLowerCase());

        List<String> st6 = produtoList.stream().filter(x -> x.getPrice() < average).map(p -> p.getName()).sorted(comp1.reversed()).toList();

        st6.forEach(System.out::println);

    }
}
