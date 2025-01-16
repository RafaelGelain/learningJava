import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada Vetor ? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i<n ; i++){
            System.out.print("Digite os valores do Vetor A : ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i<n ; i++){
            System.out.print("Digite os valores do Vetor B : ");
            b[i] = sc.nextInt();
        }

        System.out.println("VETORES RESULTANTE :  ");
        for (int i = 0; i<n ; i++){

            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }



        sc.close();
    }
}