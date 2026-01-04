package s16.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int number;
    private LocalDate date;
    private double value;
    private int installments;
    private List<Fatura> faturas = new ArrayList<>();

    public Contract(int number, LocalDate date, double value, int installments) {
        this.number = number;
        this.date = date;
        this.value = value;
        this.installments = installments;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public List<Fatura> getFaturas() {
        return faturas;
    }

    public void addFatura(Fatura fatura) {
        this.faturas.add(fatura);
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }
}
