package s16.entities;


import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;

public class CarRent {
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Car car;
    private Invoice invoice;

    public CarRent(LocalDateTime dataInicio, LocalDateTime dataFim, Car car) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.car = car;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public Car getCar() {
        return car;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }



}
