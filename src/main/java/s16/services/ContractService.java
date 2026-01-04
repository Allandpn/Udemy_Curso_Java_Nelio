package s16.services;

import s16.entities.Contract;
import s16.entities.Fatura;
import s16.interfaces.PaymentService;

import java.time.LocalDate;

public class ContractService {
    private final PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract cr){
        double mensalParcela = cr.getValue() / cr.getInstallments();
        for (int i = 0; i < cr.getInstallments(); i++){
            double interest = paymentService.calculateInterest(mensalParcela, i+1);
            double rate = paymentService.calculateRate(interest + mensalParcela);
            double totalValue = mensalParcela + interest + rate;

            LocalDate date = cr.getDate().plusMonths(i+1);
            Fatura fatura = new Fatura(mensalParcela, interest, rate, totalValue, i+1, date);
            cr.addFatura(fatura);
        }
    }
}
