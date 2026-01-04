package s16.entities;

import java.time.LocalDate;

public class Fatura {
    private double value;
    private double interest;
    private double rate;
    private double totalValue;
    private double installment;
    private LocalDate date;

    public Fatura(
            double value,
            double interest,
            double rate,
            double totalValue,
            double installment,
            LocalDate date
    )
    {
        this.value = value;
        this.interest = interest;
        this.rate = rate;
        this.totalValue = totalValue;
        this.installment = installment;
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public double getInterest() {
        return interest;
    }

    public double getRate() {
        return rate;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public double getInstallment() {
        return installment;
    }

    public LocalDate getDate() {
        return date;
    }
}
