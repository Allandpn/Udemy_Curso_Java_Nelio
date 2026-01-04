package s16.interfaces;

public interface PaymentService {
    double calculateInterest(double amount, int installment);

    double calculateRate(double amount);
}
