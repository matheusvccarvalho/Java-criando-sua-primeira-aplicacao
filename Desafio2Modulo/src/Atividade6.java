import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        int numero;
        int contador = 0;
        int multiplicacao = 1;

        Scanner fatorial = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = fatorial.nextInt();

        if (numero<0){
            System.out.println("Numero sem fatorial !");
        }
        for (int i = 1; i <= numero; i++) {
            multiplicacao = multiplicacao *i;
        }
         System.out.println(multiplicacao);
    }
}
