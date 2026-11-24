//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaCelsius = 28;
        double conversaoFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A conversao de graus %f celsius para graus em Fahrenheit é de %f", temperaturaCelsius, conversaoFahrenheit);
        System.out.println(mensagem);

        //Realizando um casting para remover as casas decimais
        int temperaturaFinal = (int) (conversaoFahrenheit);
        System.out.println("A temperatura final usando casting é de: " +temperaturaFinal);
    }
}