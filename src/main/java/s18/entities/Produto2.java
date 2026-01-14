package s18.entities;

import java.util.Comparator;
import java.util.Objects;

public class Produto2{
    private String name;
    private Double price;

    public Produto2(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean predicateProduct(Produto2 p){
        return p.getPrice() >= 1500.0;
    }

    public boolean nonpredicateProduct(){
        return getPrice() >= 1500.0;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto2 produto2 = (Produto2) o;
        return Objects.equals(name, produto2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

}
