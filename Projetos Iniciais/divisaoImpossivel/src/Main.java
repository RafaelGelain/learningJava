import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        for (int i = 0 ; i < N ; i++){
            double N1 = sc.nextFloat();
            double N2 = sc.nextFloat();

            if ( N2 == 0){
                System.out.println("DIVISAO IMPOSSIVEL");
            }
            else {
                double soma = N1 / N2;
                System.out.println(soma);
            }
        }


        sc.close();
    }
}