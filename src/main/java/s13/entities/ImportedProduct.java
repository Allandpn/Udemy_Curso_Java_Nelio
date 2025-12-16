package s13.entities;

import java.text.NumberFormat;
import java.util.Locale;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String st = super.priceTag();
        st += " Customs fee: " + nf.format(customsFee);
        return st;
    }
}
