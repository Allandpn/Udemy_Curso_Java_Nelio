package s16.entities;

public class Emprestimo {
    private double quantia;
    private int duracao;

    public Emprestimo(double quantia, int duracao) {
        this.quantia = quantia;
        this.duracao = duracao;
    }

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
