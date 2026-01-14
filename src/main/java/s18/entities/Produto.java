package s18.entities;

import java.util.Comparator;
import java.util.Objects;

public class Produto  {
    private String name;
    private Double price;

    public Produto(String name, double price) {
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

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(name, produto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}
