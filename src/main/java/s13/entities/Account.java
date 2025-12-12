package s13.entities;

public class Account {
    private Integer number;
    private String holder;
    protected double balance;

    public Account() {
    }

    public Account(Integer number,  String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void withDraw(double x){
        balance -= x + 5.0;
    }

    public void deposit(Double x){
        balance += x;
    }

}
