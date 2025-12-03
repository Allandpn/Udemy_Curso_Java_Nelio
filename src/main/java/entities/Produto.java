package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto {
    private String name;
    private double preco;
    private int quantity;



    public void showData() {
        System.out.printf("""
                Dados dos produtos:
                Nome: %s
                Preço: %.2f
                Quantidade: %d
                Valor total em estoque: %.2f
                """, name, preco, quantity, totalValueInStock());
    }

    public double totalValueInStock() {
        return preco * quantity;
    }

    public void addProducts(int q) {
        quantity += q;
    }

    public void removeProducts(int q) {
        quantity -= q;
        quantity = Math.max(quantity, 0);
    }


}
