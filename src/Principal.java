import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Digite la tasa de cambio de dólar a COP: ");
        double tasaCambio = teclado.nextDouble();





        ////////////////////////////

        System.out.println("Digite la cantidad de pesos a convertir USD: ");
        double pesosCant = teclado.nextDouble();

        ConvertirMoneda convertir = new ConvertirMoneda();
        double convirtiendo = convertir.convertirMonedaADolar(pesosCant,tasaCambio);

        System.out.println("Resultado: "+ String.format("%.2f",convirtiendo) + "$ USD");
        */
        ConsultaMoneda consulta = new ConsultaMoneda();
        System.out.println("Qué moneda deseas consultar, su tasa de cambio?: ");
        String symbolMoney = teclado.nextLine();
        Double tasaDeCambio = consulta.buscaMoneda(symbolMoney);
        System.out.println("Tasa de cambio: "+symbolMoney+" = "+tasaDeCambio);
        System.out.println("°!°!°!°!°°!°!°!°!°!°!°!°!°!°!°!°!°!°!°!°!°!°!°!◙ê↔°°°°");
        System.out.println("Digite la cantidad de dólares a convertir a COP: ");
        double cantidadCop = teclado.nextDouble();
        ConvertirMoneda conversor = new ConvertirMoneda();
        double conversion = conversor.conversionDolarAMoneda(cantidadCop,tasaDeCambio);
        System.out.println("Resultado: "+ String.format("%.2f",conversion) + "$ Pesos colombianos");

    }
}
