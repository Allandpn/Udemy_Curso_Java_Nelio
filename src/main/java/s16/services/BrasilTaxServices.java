package s16.services;

import s16.interfaces.TaxService;

public final class BrasilTaxServices implements TaxService {
    public double tax(double amount){
        if(amount > 100){
            return amount * 0.15;
        } else {
            return amount * 0.2;
        }
    }
}
