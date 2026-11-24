public class Condicionais {
    public static void main(String[] args) {

        int ano = 1996;
        int nota = 10;
        double media = (10+9+ 7) /3;
        boolean incluidoNoPlano = false;
        String tipoCliente = "normal";

        if ( incluidoNoPlano == true && tipoCliente.equals("plus")){
            System.out.println("Pode assistir!");
    }
        else{
            System.out.println("Precisa comprar!");
        }
    }
}
