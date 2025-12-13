package s10.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import s10.enums.OrderStatus;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;
}
