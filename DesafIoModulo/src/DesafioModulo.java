//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DesafioModulo {
    public static void main(String[] args) {

        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double notaMatheus = 9.6;
        double notaNicholas = 6.8;

        //Exibindo o resultado da media das notas
        double mediaIrmaos = (notaMatheus + notaNicholas)/2;

        String mensagemMedia = String.format("O resultado da média é de %.2f", mediaIrmaos);
        System.out.println(mensagemMedia);

        // Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double media = (int) (mediaIrmaos);
        String mensagemCasting = String.format("O resultado da média com Casting é de %.0f", media);
        System.out.println(mensagemCasting);

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letraInicial = 'M';
        String nomeCompleto = "Matheus Vinicius Carvalho";

        String mensagemNomes = String.format("O meu nome é %s e minha inicial é %s", nomeCompleto,letraInicial);
        System.out.println(mensagemNomes);

        // Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 9.75;
        int quantidade = 4;

        double valorCalculado = precoProduto * quantidade;
        String mensagemValor = String.format("O valor total dos produtos que Matheus vai levar é de %.2f", valorCalculado);
        System.out.println(mensagemValor);

        // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 7.60;
        double dolarHoje = 4.95;

        double resultadoConversao = valorEmDolares * dolarHoje;
        String mensagemConversao = String.format("O valor convertido de dolar em real é de %.2f reais", resultadoConversao);
        System.out.println(mensagemConversao);

        // Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
        // Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto
        // ao produto (por exemplo, 10 para 10%).
        // Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 100;
        double percentualDesconto = 10;

        double resultadoFinal = precoOriginal - ((precoOriginal*percentualDesconto)/100);
        String mensagemPorcentual = String.format("O valor de desconto do valor %.2f reais, com um desconto de %.2f  é de %.2f",precoOriginal,percentualDesconto,resultadoFinal);
        System.out.println(mensagemPorcentual);
    }
}