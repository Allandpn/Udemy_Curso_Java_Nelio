package s16.exercicies;

import s16.entities.Emprestimo;
import s16.interfaces.ServicoImposto;
import s16.services.BrasilImposto;

public class CalculaEmprestimo {
    public static void main(String args[]) {


        double amount = 200.00;
        int time = 3;

        Emprestimo emp = new Emprestimo(amount, time);

        ServicoImposto bi = new BrasilImposto();

        double total = bi.calculaJurosCompostos(emp);

        System.out.println("Amount: " + amount);
        System.out.println("Months: " + time);
        System.out.println("Payment after " + time + " months: ");
        System.out.println(String.format("%.2f", total));
    }
}
