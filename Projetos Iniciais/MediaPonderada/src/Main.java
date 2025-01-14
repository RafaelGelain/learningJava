import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for(int i=0; i<N; i++){
            double n1 = sc.nextFloat();
            double n2 = sc.nextFloat();
            double n3 = sc.nextFloat();

            double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
            System.out.println(media);
        }

        sc.close();
    }
}