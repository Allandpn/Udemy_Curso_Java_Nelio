package s16.exercicies;

import s16.entities.Contract;
import s16.interfaces.PaymentService;
import s16.services.ContractService;
import s16.services.PaypalPayment;
import s16.services.ExportService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CreateContract {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print("Data (dd/MM/yyyy: ");
        LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
        System.out.print("Valor do Contrato: ");
        double value = Double.parseDouble(sc.nextLine());
        System.out.print("Entre com o número de parcelas: ");
        int numberParcelas = Integer.parseInt(sc.nextLine());

        Contract cr = new Contract(number, date, value, numberParcelas);

        PaymentService pS = new PaypalPayment();

        ContractService crS = new ContractService(pS);

        crS.processContract(cr);

        ExportService.printContract(cr);

        ExportService.saveFileContract(cr);

        sc.close();
    }

}
