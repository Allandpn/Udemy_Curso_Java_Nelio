package s16.services;

import s16.entities.Emprestimo;
import s16.interfaces.ServicoImposto;

public class BrasilImposto implements ServicoImposto {
    private final double taxaMensal = 0.02;


    @Override
    public double getTaxaMensal() {
        return taxaMensal;
    }

}
