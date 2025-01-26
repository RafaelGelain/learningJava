import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar : ");
        int N = sc.nextInt();

        int vect[] = new int[N];

        for (int i = 0; i < N ; i++){
            System.out.print("Digite um numero :");
            vect[i] = sc.nextInt();
        }
        System.out.println(vect);
        sc.close();
    }
}