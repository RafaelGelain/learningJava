import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor : ");
        int n = sc.nextInt();

        double[] numero = new double[n];


        for (int i = 0 ; i < n ; i++){
            System.out.print("Digite um numero : ");
            numero[i] = sc.nextDouble();
        }

        System.out.println();
        double soma = 0;
        for (int i = 0 ; i < n ; i++){
            soma += numero[i];
        }
        double media = soma / n;
        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA : ");

        for (int i = 0 ; i < n ; i++){

            if ( numero[i] < media){
                System.out.println(numero[i]);
            }
        }








        sc.close();
    }
}