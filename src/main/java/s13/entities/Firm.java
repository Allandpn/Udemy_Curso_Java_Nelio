package s13.entities;

import java.util.ArrayList;
import java.util.List;


public class Firm {
    private List<Employee> listEmployee = new ArrayList<>();

    public Firm(){}

    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    public void hireEmployee(Employee e){
        listEmployee.add(e);
    }

    public void firEmployee(Employee e){
        listEmployee.remove(e);
    }
}
