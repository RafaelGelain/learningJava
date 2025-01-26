import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 - alcool
        //2 - gasolina
        //3 - diesel
        //4 - fim
        //qualquer outro numero retorna erro

        int produto = sc.nextInt();
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        while (produto != 4 ){
            if ( produto == 1){
                alcool = alcool + 1;
            } else if (produto == 2) {
                gasolina = gasolina + 1;
            } else if (produto == 3) {
                diesel = diesel + 1;
            }
            produto = sc.nextInt();
        }
        System.out.println(" MUITO OBRIGADO ");
        System.out.println("alcool > " + alcool);
        System.out.println("gasolina > " + gasolina);
        System.out.println("diesel > " + diesel);

        sc.close();

    }
}