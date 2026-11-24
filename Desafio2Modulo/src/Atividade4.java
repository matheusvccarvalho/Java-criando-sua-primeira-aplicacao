import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        // Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        int numero;
        int resultado = 0;

        Scanner taboada = new Scanner(System.in);
        System.out.println("Por favor, digite um número: ");
        numero = taboada.nextInt();

        for (int i = 1; i < 11; i++) {
            resultado = numero * i ;
            String mensagem = String.format("%s x %s é igual a %s",i,numero,resultado);
            System.out.println(mensagem);
        }
    }
}
