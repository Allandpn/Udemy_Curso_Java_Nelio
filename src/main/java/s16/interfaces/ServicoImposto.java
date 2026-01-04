package s16.interfaces;

import s16.entities.Emprestimo;

public interface ServicoImposto {

    double getTaxaMensal();

    default double calculaJurosCompostos(Emprestimo emp){
        if (emp.getDuracao() < 1 ){
            throw new RuntimeException();
        }
        return emp.getQuantia() * Math.pow(1 + getTaxaMensal(), emp.getDuracao());
    }
}
