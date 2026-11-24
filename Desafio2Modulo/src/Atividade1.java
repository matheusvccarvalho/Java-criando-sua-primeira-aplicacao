import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade1 {
    public static void main(String[] args) {

        //Crie um programa que solicite ao usuário digitar um número.
        // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        int numero;
        Scanner desafio = new Scanner(System.in);

        System.out.println("Digite um numero:");
        numero = desafio.nextInt();

        if (numero>=0){
            System.out.println("Numero positivo!");
        }
        else{
            System.out.println("Numero negativo!");
        }
    }
}