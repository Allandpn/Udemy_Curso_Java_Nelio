package s16.services;

import s16.interfaces.PaymentService;

public class PaypalPayment implements PaymentService {
    private double INTEREST = 0.01;
    private double RATE = 0.02;

    @Override
    public double calculateInterest(double amount, int installment) {
        return amount * this.INTEREST * installment;
    }

    @Override
    public double calculateRate(double amount) {
        return amount * this.RATE;
    }
}
