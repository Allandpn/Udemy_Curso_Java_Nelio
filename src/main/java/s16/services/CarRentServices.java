package s16.services;

import s16.entities.CarRent;
import s16.entities.Invoice;
import s16.interfaces.TaxService;

import java.text.NumberFormat;
import java.time.Duration;
import java.util.Locale;

public class CarRentServices {
    private double pricePerHour;
    private double pricePerDay;
    private TaxService tax;

    public CarRentServices(double pricePerHour, double pricePerDay, TaxService tax) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.tax = tax;
    }

    public void processInvoice(CarRent carRent){
        double minutes = Duration.between(carRent.getDataInicio(), carRent.getDataFim()).toMinutes();
        double hours = minutes / 60;
        double basePayment;
        if(hours > 12){
            double days = Math.ceil(hours / 24.0);
            basePayment = days * this.pricePerDay;
        } else {
            basePayment =  hours * this.pricePerHour;
        }
        carRent.setInvoice(new Invoice(basePayment, tax.tax(basePayment)));
    }


    public String emiteRecibo(CarRent cr){
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        StringBuilder sb = new StringBuilder();
        sb.append("INVOICE\n")
                .append("Basic payment: ")
                .append(nf.format(cr.getInvoice().getBasicPayment()) + "\n")
                .append("Tax: ")
                .append(nf.format(cr.getInvoice().getTax()) + "\n")
                .append("Total payment: ")
                .append(nf.format(cr.getInvoice().gettotalPayment()) + "\n");

        return sb.toString();
    }
}
