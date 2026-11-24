import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        // Crie um menu que oferece duas opções ao usuário:
        // "1. Calcular área do quadrado" e "2.
        // Calcular área do círculo".
        // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

        int opcao = 0;
        int medida =2;
        int circulo =3;

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite uma opcao: ");
        opcao = numero.nextInt();

        switch (opcao){
            case 1:
                int resultadoQuadrado = medida*medida;
                System.out.println("A Área do queadrado é de: " +resultadoQuadrado);
                break;

            case 2:
                int resultadoCirculo = circulo*circulo;
                System.out.println("A área do circulo é de: " +resultadoCirculo);
                break;

            default:
                System.out.println("Por favor, insira uma opção valida");
        }



    }

}
