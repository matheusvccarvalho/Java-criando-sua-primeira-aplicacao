import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        // Peça ao usuário para inserir dois números inteiros.
        // Compare os números e imprima uma mensagem indicando se são iguais,
        // diferentes, o primeiro é maior ou o segundo é maior.

        Scanner numeroInteiro = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite um número inteiro:");
        numero1 = numeroInteiro.nextInt();
        System.out.println("Digite um número inteiro:");
        numero2 = numeroInteiro.nextInt();

        if (numero1 != numero2) {
             if (numero1>numero2) {
                System.out.println("O número maior é o: " +numero1);

            } else {
                 System.out.println("O maior número é o: " +numero2);
             }
                 System.out.println("Numeros diferentes!");
            }
        else{
            System.out.println("Os numeros são iguais!");
         }
       }
    }
