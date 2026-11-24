import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        // Crie um programa que solicite ao usuário a entrada de um número inteiro.
        // Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        int numero;

        Scanner verifica = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        numero = verifica.nextInt();

        if (numero %2 ==0){
            System.out.println("Numero par");
        }
        else {
            System.out.println("Numero impar");
        }

    }
}
