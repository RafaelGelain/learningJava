package application;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Product product = new Product();

    System.out.println("Nome do Produto : ");
    System.out.print("Name : ");
    product.name = sc.nextLine();
    System.out.print("Preco : ");
    product.price = sc.nextDouble();
    System.out.print("Quantidade no Estoque : ");
    product.quantity = sc.nextInt();

    System.out.println();
    System.out.println("Produtos Dados : " + product);

    System.out.println();
    System.out.println("Digite o numero de produtos para ser adicionado no estoque :");
    int quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Dados Atualizado  : " + product);

    System.out.println();
    System.out.println("Digite o numero de produtos para ser removido no estoque :");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Dados Atualizado  : " + product);

    sc.close();
    }
}
