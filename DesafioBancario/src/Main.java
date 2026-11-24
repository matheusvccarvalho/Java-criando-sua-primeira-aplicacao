import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Desafio: Crie um programa que simule uma conta bancária.
//
// O programa deverá apresentar o nome do titular, o tipo de conta e o saldo inicial.
//
// Em seguida, deverá exibir um menu com as opções:
//
// 1 - Consultar saldo
// 2 - Depositar valor
// 3 - Transferir valor
// 4 - Sair
//
// O usuário deverá poder realizar operações até escolher a opção de sair.
//
// Na opção de depósito, o programa deverá solicitar um valor e adicioná-lo ao saldo.
//
// Na opção de transferência, deverá solicitar um valor e verificar se existe saldo suficiente
// para realizar a operação. Caso exista, o valor deverá ser descontado do saldo.
//
// Caso o usuário escolha uma opção inválida, deverá ser exibida uma mensagem de erro.
//
// Ao sair, deverá ser exibida uma mensagem de despedida.

        String nomeTitular = "Matheus Carvalho";
        String tipoConta = "Conta Corrente";
        double saldoAtual = 420.50;
        double valorDeposito = 0;
        double valorTranferir = 0;

        int opcao = 0;

        String mensagemIncial = String.format("Olá %s, sua conta é do tipo %s e seu saldo incial é de: %.2f ",nomeTitular,tipoConta,saldoAtual);
        System.out.println(mensagemIncial);

        while (opcao !=4 ) {

            Scanner banco = new Scanner(System.in);
            System.out.println("Por favor digite uma opção, sendo:\n" +
                    "1 - Consultar saldo\n" +
                    "2- Depósito de valor\n" +
                    "3- Transferir valor\n" +
                    "4- Sair\n");

                opcao = banco.nextInt();

                switch (opcao){
                    case 1:
                        System.out.println("Seu saldo atual é de: " +saldoAtual);
                        break;

                    case 2:
                        System.out.println("Digite o valor que deseja Depositar: ");
                        Scanner deposito = new Scanner(System.in);
                        valorDeposito = deposito.nextDouble();
                        saldoAtual = (valorDeposito+saldoAtual);
                        System.out.println("Seu saldo atual é de: " +saldoAtual);
                        break;

                    case 3:
                        System.out.println("Digite o valor que deseja transferir: ");
                        Scanner transferencia = new Scanner(System.in);
                        valorTranferir = transferencia.nextDouble();
                        if (valorTranferir>saldoAtual){
                            System.out.println("Saldo Insuficiente!");
                        }
                        else
                         saldoAtual = (saldoAtual - valorTranferir);

                        System.out.println("Seu saldo atual é de: " +saldoAtual);
                        break;

                    case 4:
                        System.out.println("Até logo, foi um prazer " +nomeTitular);
                        break;

                    default:
                        System.out.println("Opcao Invalida! ");
                }
        }
        
    }
}