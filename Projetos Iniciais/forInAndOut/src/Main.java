import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dentro = 0 ,fora = 0;

        for (int i=0; i<N ; i++){
            int x = sc.nextInt();
            if ( x >= 10 && x <= 20){
                dentro += 1;
            }else {
                fora = fora + 1;
            }

        }
        System.out.println(dentro + "dentro");
        System.out.println(fora + "fora");
    }
}