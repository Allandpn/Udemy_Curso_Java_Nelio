package s13.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getCustomsFee() {
        return manufactureDate;
    }

    public void setCustomsFee(LocalDate customsFee) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName()).append(" $ ").append(super.getPrice()).append("Manufacture date: $ ").append(manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        return sb.toString();
    }
}
