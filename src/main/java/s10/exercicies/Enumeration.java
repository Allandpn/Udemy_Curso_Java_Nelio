package s10.exercicies;
import s10.enums.OrderStatus;
import s10.entities.Order;

import java.time.LocalDateTime;
import java.util.Date;

public class Enumeration {
    public static void main(String[] args){
        Order pedido = new Order(1, new Date(), OrderStatus.DEVILERED);

        System.out.println(pedido);

        OrderStatus os1 = OrderStatus.DEVILERED;
        OrderStatus os2 = OrderStatus.valueOf("DEVILERED");

        System.out.println(os1.getClass().getSimpleName());
        System.out.println(os2.getClass());

    }
}
