import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // alcool
         // gasolina
         // diesel
        int x = sc.nextInt();
        int gasolina = 0; int alcool = 0 ; int diesel = 0 ;

        while ( x != 4) {
            x = sc.nextInt();
            switch (x){
                case 1:
                alcool += 1;
                break;

                case 2:
                gasolina += 1;
                break;

                case 3:
                diesel += 1;
                break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println(alcool);
        System.out.println(gasolina);
        System.out.println(diesel);
    }
}