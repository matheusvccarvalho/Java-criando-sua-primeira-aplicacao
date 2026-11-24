import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Criando as variaveis zeradas para o looping.
        double mediaAvaliacao = 0;
        double nota =0;
        int totaldeNotas = 0;

        //Criando o loop while ---> Enquanto a condição foir verdadeira, será repetida a estrutura.
        while (nota != -1){
            System.out.println("Digite sua avaliação ao filme e -1 para encerrar:");
            nota = leitura.nextDouble();

        //Criando uma condicional para armazenar as notas e a quantidade de vezes que foi repetido o loop,
        //Dessa forma, dividimos a nota pela quantidade de vezes que o loop foi repetido.

        if (nota !=-1){
            mediaAvaliacao = mediaAvaliacao + nota;
            totaldeNotas ++;
        }
        }
        System.out.println("Média de avaliações: " +mediaAvaliacao/totaldeNotas);
    }
}
