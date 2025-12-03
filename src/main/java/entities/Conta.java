package entities;

public class Conta {
    private final int numeroConta;
    private String nome;
    private double saldo;

    public Conta(int numeroConta, String nome, double saldo){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.deposit(saldo);
    }

    public Conta(int numeroConta, String nome){
        this(numeroConta, nome, 0.0);
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return this.saldo;
    }


    public void deposit(double valor){
        if(valor < 0) throw new IllegalArgumentException("Valor negativo não permitido");
        this.saldo += valor;
    }

    public void withdraw(double valor){
        if(valor < 0) throw new IllegalArgumentException("Valor negativo não permitido");
        if(valor > this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public String toString(){
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", this.numeroConta, this.nome, this.saldo);
    }

}
