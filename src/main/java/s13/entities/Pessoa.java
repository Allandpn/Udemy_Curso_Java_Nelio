package s13.entities;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Pessoa {
    private String nome;
    private double rendaAnual;
    private NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    protected Pessoa(String nome, double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public NumberFormat getNf() {
        return nf;
    }

    public abstract double calculaImposto();

    @Override
    public String toString(){
        return nome + " " + nf.format(calculaImposto());
    }
}
