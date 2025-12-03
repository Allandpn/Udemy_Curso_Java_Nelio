package exercices;

import entities.ProdutoConst;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueProdutos {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        int quantity = sc.nextInt();

//        ProdutoConst p = new ProdutoConst(name, preco, quantity);

        ProdutoConst p = new ProdutoConst(name, preco);

        p.showData();


        System.out.print("Digite a quantidade do produto para adicionar: ");
        int entradaProduto = sc.nextInt();
        p.addProducts(entradaProduto);
        p.showData();

        System.out.print("Digite a quantidade do produto para retirar: ");
        int saidaProduto = sc.nextInt();
        p.removeProducts(saidaProduto);
        p.showData();


        sc.close();
    }


}
