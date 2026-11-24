
//Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula
// com o seguinte desafio:

//Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
// e pedir para que o usuário tente adivinhar o número,
// em até 5 tentativas. A cada tentativa, o programa deve informar
// se o número digitado pelo usuário é maior ou menor do que o número gerado.


import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado;

        System.out.println("Digite um número de 0 a 100. Será que vai de primeira? ");
        numeroDigitado = numero.nextInt();
        tentativas++;


        if (numeroDigitado == numeroAleatorio) {
            System.out.println("Aii Sim! De primeira! Parabéns!!");
        }

        while (numeroAleatorio != numeroDigitado) {
            System.out.println("Quantidade de tentativas " +tentativas);
            tentativas++;

            System.out.println("Digite um número de 0 a 100: ");
            numeroDigitado = numero.nextInt();


            if (tentativas ==5){
                System.out.println("Quantidade de tentativas " +tentativas);
                String mensagemFim = String.format("Infelizmente não deu certo, mas o numero era o %s", numeroAleatorio);
                System.out.println(mensagemFim);
                break;

            } else if (numeroAleatorio == numeroDigitado){
                System.out.println("Parabéns, voce acertou!");
            }

            if (numeroDigitado>numeroAleatorio){
                System.out.println("O número digitado é maior que o numero aleatório em! haha");
            }
            else{
                System.out.println("O número digitado é menor que o número aleatório Peão! ");
            }
        }
    }
}   