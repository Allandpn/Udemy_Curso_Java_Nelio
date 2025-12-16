package s13.exercicies;

import s13.entities.Employee;
import s13.entities.Firm;
import s13.entities.OutsourcedEnployee;

import java.util.Locale;
import java.util.Scanner;

public class CreateFirm {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Firm firm = new Firm();

        System.out.print("Enter the number of employee: ");
        int nEmployee = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nEmployee; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)?");
            char isOutsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if (isOutsourced == 'y' || isOutsourced == 'Y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                sc.nextLine();
                OutsourcedEnployee outsourcedEnployee = new OutsourcedEnployee(name, hours, valuePerHour, additionalCharge);
                firm.hireEmployee(outsourcedEnployee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                firm.hireEmployee(employee);
            }
        }
        System.out.println("PAYMENTS: ");
        for(Employee e: firm.getListEmployee()){
            System.out.printf(e.getName() + " - $ %.2f", e.payment());
        }

        sc.close();
    }

}
