package s10.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;

    public Account() {
    }

    public Account(Double balance, String holder, Integer number) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
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

    public void withDraw(Double x){
        balance -= x;
    }

    public void deposit(Double x){
        balance += x;
    }

}
