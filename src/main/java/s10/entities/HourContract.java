package s10.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class HourContract {
    private LocalDate date;
    Double valuePerHour;
    Integer hours;

    public Double totalValue(){
        return hours * valuePerHour;
    }
}
