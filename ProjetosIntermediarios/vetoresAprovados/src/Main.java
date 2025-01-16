import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados : ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0 ; i < n ; i++){
            System.out.println("Digite o nome , primeira e segunda nota do " + (i+1) + " aluno");
            sc.nextLine();
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos Aprovados : ");
        for (int i = 0 ; i < n ; i++){
            double media = (nota1[i] + nota2[i]) / 2;
            if (media >= 6){
                System.out.printf("%s\n",nome[i]);
            }
        }




        sc.close();
    }
}