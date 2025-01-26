import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextFloat();

        if ( x < 0 || x > 100){
            System.out.println("Fora do Intervalo");
        } else if (x < 25.01) {
            System.out.println("Intervalo [ 0 , 25] ");
        }
        else if (x < 50.01) {
            System.out.println("Intervalo [ 25 , 50] ");
        }
        else if (x < 75.01) {
            System.out.println("Intervalo [ 50 , 75] ");
        }else {
            System.out.println("Intervalo [ 75 , 100] ");
        }
    }
}