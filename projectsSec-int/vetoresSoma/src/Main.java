import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar ? ");
        int n = sc.nextInt();

        double vect[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero : ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }
        System.out.println();

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        System.out.println(soma);
        double avg = soma / n;
        System.out.println(avg);
    }
}