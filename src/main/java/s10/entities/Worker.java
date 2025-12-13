package s10.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import s10.enums.WorkerLevel;
import s10.entities.HourContract;
import s10.entities.Department;

import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Data
public class Worker {
    String name;
    WorkerLevel level;
    Double baseSalary;
    Department department;
    List<HourContract> hourContracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract){
        hourContracts.add(contract);
    }

    public void removeContract(HourContract contract){
        hourContracts.remove(contract);
    }

    public Double income(YearMonth yearMonth){
        return baseSalary +
                hourContracts.stream()
                        .filter(c -> YearMonth.from(c.getDate()).equals(yearMonth))
                        .mapToDouble(HourContract::totalValue)
                        .sum();
    }

}
