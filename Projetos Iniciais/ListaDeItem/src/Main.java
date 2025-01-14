import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ID 1 - CACHORRO QUENTE - VALOR 4.00
        //ID 2 - X-SALADA - VALOR 4.5
        //ID 3 - X-BACON -  VALOR 5.0
        //ID 4 - TORRADA SIMPLES - 2.0
        //ID 5 - REFRIGERANTE - VALOR 1.5

        int id = sc.nextInt();
        int qtd = sc.nextInt();
        double resultado;

        switch (id){
            case 1:
                resultado = qtd * 4.00;
                System.out.printf("Valor : %.2f%n", resultado);
                break;
            case 2:
                resultado = qtd * 4.50;
                System.out.printf("Valor : %.2f%n", resultado);
                break;
            case 3:
                resultado = qtd * 5.00;
                System.out.printf("Valor : %.2f%n", resultado);
                break;
            case 4:
                resultado = qtd * 2.00;
                System.out.printf("Valor : %.2f%n", resultado);
                break;
            case 5:
                resultado = qtd * 1.50;
                System.out.printf("Valor : %.2f%n", resultado);
                break;
        }
    }
}