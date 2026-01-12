package s17.services;

import s16.interfaces.PaymentService;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        return list.get(0);
    }

    public void print(){
        System.out.println(list);
    }

}
