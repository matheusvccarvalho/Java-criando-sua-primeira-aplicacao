//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");//TI
        System.out.println("Fime top: O menino da porteira");

        //Trzaendo dados do filme, notas de Matheus, Ezau e Adriana
        int ano = 1996;
        int nota = 10;
        double media = (10+9+ 7) /3;
        boolean incluidoNoPlano = true;

        System.out.println("Nota do fime: " +nota);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("A media da nota do filme é de: " +media);

        String sinopse = "Filme maravilhoso, passa na fazenda";
        System.out.println(sinopse);

        // Usando um castin para converter a variavel media em inteiro
        int classificacao = (int) (media/2);
        System.out.println( "Esse filme tem uma classificacao de " +classificacao);

        }
    }
