package s13.entities;


public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHourl;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHourl) {
        this.name = name;
        this.hours = hours;
        this.valuePerHourl = valuePerHourl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHourl() {
        return valuePerHourl;
    }

    public void setValuePerHourl(Double valuePerHourl) {
        this.valuePerHourl = valuePerHourl;
    }

    public Double payment(){
        return hours * valuePerHourl;
    }
}
