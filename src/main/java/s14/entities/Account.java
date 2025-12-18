package s14.entities;

import s14.exceptions.AccountExceptions;


public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) throws AccountExceptions{
        this.number = number;
        this.holder = holder;
        deposit(balance);
        updateWithdrawLimit(withdrawLimit);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double value) throws AccountExceptions {
        if(value <= 0){
            throw new AccountExceptions("Valor deve ser maior que 0");
        }
        this.balance += value;
    }

    public void updateWithdrawLimit(double value) throws AccountExceptions{
        if(value < 0){
            throw new AccountExceptions("Valor deve ser maior ou igual a 0");
        }
        this.withdrawLimit = value;
    }

    public void withdraw(double value) throws AccountExceptions{
        if(value < 0){
            throw new AccountExceptions("Valor deve ser maior ou igual a 0");
        }
        if(balance < value){
            throw new AccountExceptions("Saldo insuficiente");
        }
        if(withdrawLimit < value){
            throw new AccountExceptions("Limite de saque insuficiente");
        }
        balance -= value;
    }
}
