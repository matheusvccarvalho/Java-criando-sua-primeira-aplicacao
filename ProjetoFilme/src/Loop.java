import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Declarando as variaveis para o loop, iniciando do zero.
        double mediaAvaliacao = 0;
        double nota = 0;

        // Estrutura de repeticao, que diz: Para "i" iniciando de zero, some de 1 em 1 até ser repetido 3 vezes
        for (int i = 0; i <3 ; i++) {
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao = mediaAvaliacao + nota; // A mediaAvaliacao está zerada, ela vai receber os valores das notas, somadas das 3 vez
        }
        System.out.println("Média de avaliações: " +mediaAvaliacao/3);
    }
}
