package s15.entities;

public class Product {
    private String name;
    private double price;
    private int qnt;
    private double priceTotal;

    public Product(String name, double price, int qnt) {
        this.name = name;
        this.price = price;
        this.qnt = qnt;
        this.priceTotal = priceTotal();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }

    private double priceTotal(){
        return  price * qnt;
    }

    public String toCsv(){
        return name + "," + priceTotal;
    }
}
