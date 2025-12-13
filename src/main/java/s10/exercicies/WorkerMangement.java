package s10.exercicies;

import s10.entities.Department;
import s10.entities.HourContract;
import s10.entities.Worker;
import s10.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class WorkerMangement {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();
        System.out.print("How many contracts to this worker?");
        int nContracts = sc.nextInt();
        sc.nextLine();
        Worker worker = new Worker(name, level, baseSalary, department);
        for(int i = 0; i < nContracts; i++){
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String stringData = sc.nextLine();
            LocalDate date = LocalDate.parse(stringData, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration: ");
            Integer duration = sc.nextInt();
            sc.nextLine();
            HourContract contract = new HourContract(date, valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY); ");
        String yM = sc.nextLine();
        YearMonth yearMonth = YearMonth.parse(yM, DateTimeFormatter.ofPattern("MM/yyyy"));
        System.out.println("Name: "+ worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + yearMonth.format(DateTimeFormatter.ofPattern("MM/yyyy")) + ": " + worker.income(yearMonth));
    }
}
