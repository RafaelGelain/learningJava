package application;

import entities.retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        retangulo retangulo = new retangulo();

        System.out.println("Digite a altura e largura do retangulo :");
        retangulo.height = sc.nextDouble();
        retangulo.width = sc.nextDouble();

        System.out.println("Area : " + retangulo.area());
        System.out.println("Perimetro : " + retangulo.perimeter());
        System.out.println("Diagonal : " + retangulo.diagonal());





    }
}