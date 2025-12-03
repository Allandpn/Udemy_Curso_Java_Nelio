package entities;

public class ProdutoConst {
    private String nome;
    private double valor;
    private int quantidade;

    public ProdutoConst(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;

    }public ProdutoConst(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void showData() {
        System.out.printf("""
                 Nome do Produto: %s
                 Valor: %.2f
                 Quantidade: %d
                 Valor em estoque: %.2f
                """, this.nome, this.valor, this.quantidade, this.totalValorEstoque());
    }

    private double totalValorEstoque() {
        return this.quantidade * this.valor;
    }


    public void addProducts(int qnt) {
        this.quantidade += qnt;
    }

    public void removeProducts(int qnt) {
        this.quantidade -= qnt;
        this.quantidade = Math.max(this.quantidade, 0);
    }


}
