import java.util.Scanner;

public class MenuContinentes {
    private Scanner teclado = new Scanner(System.in);
    ConsultaMoneda consulta = new ConsultaMoneda();
    private double cantidadMoneyUser;
    private String symbolMoney;
    private Double conversion;
    Double tasaDeCambio;

    ConvertirMoneda conversor = new ConvertirMoneda();


    public String getSymbolMoney() {
        return symbolMoney;
    }

    public void setSymbolMoney(String symbolMoney) {
        this.symbolMoney = symbolMoney;
    }

    //System.out.println("Resultado: "+ String.format("%.2f",conversion) + "$ Pesos colombianos");

    public double getCantidadMoneyUser() {
        return cantidadMoneyUser;
    }
    public void setCantidadMoneyUser(double cantidadMoneyUser) {
        this.cantidadMoneyUser = cantidadMoneyUser;
    }

    public void menuNorteamerica() {
        String norteamerica = "Estás en norteamérica:  \n" +
                "¿Qué operación deseas realizar?\n" +
                "1) (Canadá-cad) Convertir dólares canadienses a dólares estadounidenses.\n" +
                "2) (Canadá-cad) Convertir dólares estadounidenses a dólares canadienses .\n" +
                "3) (México-mxn) Convertir pesos mexicanos a dólares estadounidenses.\n" +
                "4) (México-mxn) Convertir dólares estadounidenses a pesos mexicanos.\n" +
                "5) Volver al menú principal.\n";
        int decisionUser = 0;
        while (decisionUser != 5) {
            System.out.println(norteamerica);
            decisionUser = teclado.nextInt();
            switch (decisionUser) {
                case 1:
                    symbolMoney = "CAD";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares canadienses a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 2:
                    symbolMoney = "CAD";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CAD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" (CAD).");
                    break;
                case 3:
                    symbolMoney = "MXN";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de pesos mexicanos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 4:
                    symbolMoney = "MXN";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (MXN): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" (MXN)");
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo por favor.");
                    break;
            }
        }
    }

    public void menuCentroamerica() {
        String centroamerica = "Estás en Centroamérica:  \n" +
                "¿Qué operación deseas realizar?\n" +
                "1) (Guatemala-gtq) Convertir quetzales a dólares estadounidenses.\n" +
                "2) (Guatemala-gtq) Convertir dólares estadounidenses a quetzales .\n" +
                "3) (Honduras-hnl) Convertir Lempiras a dólares estadounidenses.\n" +
                "4) (Honduras-hnl) Convertir dólares estadounidenses a Lempiras.\n" +
                "5) (Nicaragua-nio) Convertir Córdobas Nicaguarenses a dólares estadounidenses.\n" +
                "6) (Nicaragua-nio) Convertir dólares estadounidenses a Córdobas Nicaguarenses.\n" +
                "7) (Costa Rica-crc) Convertir Colones Costaricenses a dólares estadounidenses.\n" +
                "8) (Costa Rica-crc) Convertir dólares estadounidenses a Colones Costaricenses.\n" +
                "9) Volver al menú principal.\n";

        int decisionUser = 0;

        while (decisionUser != 9) {
            System.out.println(centroamerica);
            decisionUser = teclado.nextInt();
            switch (decisionUser) {
                case 1:
                    symbolMoney = "GTQ";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de quetzales a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 2:
                    symbolMoney = "GTQ";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (GTQ): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" GTQ");
                    break;
                case 3:
                    symbolMoney = "HNL";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de Lempiras a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 4:
                    symbolMoney = "HNL";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (HNL): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" HNL");
                    break;
                case 5:
                    symbolMoney = "NIO";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de Córdobas Nicaguarenses a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 6:
                    symbolMoney = "NIO";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (NIO): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" NIO");
                    break;
                case 7:
                    symbolMoney = "CRC";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de Colones Costaricenses a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 8:
                    symbolMoney = "CRC";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CRC): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" CRC");
                    break;
                case 9:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo por favor.");
                    break;
            }
        }
    }

    public void menuSudamerica() {
        String sudamerica = "Estás en Sudamérica:  \n" +
                "¿Qué operación deseas realizar?\n" +
                "1) (Colombia-cop) Convertir pesos colombianos a dólares estadounidenses.\n" +
                "2) (Colombia-cop) Convertir dólares estadounidenses a pesos colombianos.\n" +
                "3) (Venezuela-ves) Convertir Bolívares a dólares estadounidenses.\n" +
                "4) (Venezuela-ves) Convertir dólares estadounidenses a Bolívares.\n" +
                "5) (Peru-pen) Convertir Soles Peruanos a dólares estadounidenses.\n" +
                "6) (Peru-pen) Convertir dólares estadounidenses a Soles Peruanos.\n" +
                "7) (Bolivia-bob) Convertir Bolivianos a dólares estadounidenses.\n" +
                "8) (Bolivia-bob) Convertir dólares estadounidenses a Bolivianos.\n" +
                "9) (Paraguay-pyg) Convertir Guaraníes a dólares estadounidenses.\n" +
                "10) (Paraguay-pyg) Convertir dólares estadounidenses a Guaraníes.\n" +
                "11) (Uruguay-uyu) Convertir Pesos Uruguayos a dólares estadounidenses.\n" +
                "12) (Uruguay-uyu) Convertir dólares estadounidenses a Pesos Uruguayos.\n" +
                "13) (Chile-clp) Convertir Pesos Chilenos a dólares estadounidenses.\n" +
                "14) (Chile-clp) Convertir dólares estadounidenses a Pesos Chilenos.\n" +
                "15) Volver al menú principal.\n";

        int decisionUser = 0;

        while (decisionUser != 5) {
            System.out.println(sudamerica);
            decisionUser = teclado.nextInt();
            switch (decisionUser) {
                case 1:
                    symbolMoney = "COP";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de pesos colombianos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 2:
                    symbolMoney = "COP";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (COP): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" COP");
                    break;
                case 3:
                    symbolMoney = "VES";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de Bolívares a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 4:
                    symbolMoney = "VES";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (VES): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" VES");
                    break;
                case 5:
                    symbolMoney = "PEN";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de soles peruanos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 6:
                    symbolMoney = "PEN";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (PEN): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" PEN");
                    break;
                case 7:
                    symbolMoney = "BOB";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de bolivianos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 8:
                    symbolMoney = "BOB";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (BOB): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" BOB");
                    break;
                case 9:
                    symbolMoney = "PYG";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de guaraníes a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 10:
                    symbolMoney = "PYG";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (PYG): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" PYG");
                    break;
                case 11:
                    symbolMoney = "UYU";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de pesos uruguayos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 12:
                    symbolMoney = "UYU";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (UYU): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" UYU");
                    break;
                case 13:
                    symbolMoney = "CLP";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de pesos chilenos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 14:
                    symbolMoney = "CLP";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CLP): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" CLP");
                    break;
                case 15:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        }
    }

    public void menuCaribe() {
        String caribe = "Estás en el Caribe:  \n" +
                "¿Qué operación deseas realizar?\n" +
                "1) (Cuba-cup) Convertir Pesos Cubanos a dólares estadounidenses.\n" +
                "2) (Cuba-cup) Convertir dólares estadounidenses a Pesos Cubanos.\n" +
                "3) (República Dominicana-dop) Convertir Pesos Dominicanos a dólares estadounidenses.\n" +
                "4) (República Dominicana-dop) Convertir dólares estadounidenses a Pesos Dominicanos.\n" +
                "5) (Haití-htg) Convertir Gourdes a dólares estadounidenses.\n" +
                "6) (Haití-htg) Convertir dólares estadounidenses a Gourdes.\n" +
                "7) (Jamaica-jmd) Convertir Dólares Jamaiquinos a dólares estadounidenses.\n" +
                "8) (Jamaica-jmd) Convertir dólares estadounidenses a Dólares Jamaiquinos.\n" +
                "9) Volver al menú principal.\n";

        int decisionUser = 0;

        while (decisionUser != 5) {
            System.out.println(caribe);
            decisionUser = teclado.nextInt();
            switch (decisionUser) {
                case 1:
                    symbolMoney = "CUP";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de pesos cubanos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 2:
                    symbolMoney = "CUP";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CUP): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" CUP");
                    break;
                case 3:
                    symbolMoney = "DOP";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de pesos dominicanos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 4:
                    symbolMoney = "DOP";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (DOP): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" DOP");
                    break;
                case 5:
                    symbolMoney = "HTG";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de gourdes a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 6:
                    symbolMoney = "HTG";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (HTG): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" HTG");
                    break;
                case 7:
                    symbolMoney = "JMD";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares jamaiquinos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 8:
                    symbolMoney = "JMD";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (JMD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" JMD");
                    break;
                case 9:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        }
    }

    public void menuEuropa() {
        String europa = "Estás en norteamérica:  \n" +
                "¿Qué operación deseas realizar?\n" +
                "1) Deseas cónocer: ¿Qué países utilizan de moneda el Euro?.\n" +
                "2) (Países con moneda Euro) Convertir Euros a dólares estadounidenses.\n" +
                "3) (Países con moneda Euro) Convertir dólares estadounidenses a Euros.\n" +
                "4) (Reino Unido-gbp) Convertir Libras Esterlinas a dólares estadounidenses.\n" +
                "5) (Reino Unido-gbp) Convertir dólares estadounidenses a Libras Esterlinas.\n" +
                "6) (Suiza-chf) Convertir Francos Suizos a dólares estadounidenses.\n" +
                "7) (Suiza-chf) Convertir dólares estadounidenses a Francos Suizos.\n" +
                "8) (Noruega-nok) Convertir Coronas Noruegas a dólares estadounidenses.\n" +
                "9) (Noruega-nok) Convertir dólares estadounidenses a Coronas Noruegas.\n" +
                "10) (Ucrania-uah) Convertir Grivnas a dólares estadounidenses.\n" +
                "11) (Ucrania-uah) Convertir dólares estadounidenses a Grivnas.\n" +
                "12) (Islandia-isk) Convertir Coronas Irlandesas a dólares estadounidenses.\n" +
                "13) (Islandia-isk) Convertir dólares estadounidenses a Coronas Irlandesas.\n" +
                "14) (Serbia-rsd) Convertir Dinares Serbios a dólares estadounidenses.\n" +
                "15) (Serbia-rsd) Convertir dólares estadounidenses a Dinares Serbios.\n" +
                "16) Volver al menú principal.\n";

        int decisionUser = 0;

        while (decisionUser != 5) {
            System.out.println(europa);
            decisionUser = teclado.nextInt();
            switch (decisionUser) {
                case 1:
                    String paisesConEuro = "Lista de países que utilizan el Euro como moneda Nacional: \n"+
                                           "| Alemania | - | Francia | - | España | - | Italia | - | Portugal | -\n";
                    System.out.println("Su resultado es...");
                    break;
                case 2:
                    symbolMoney = "EUR";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de Euros a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" USD");
                    break;
                case 3:
                    symbolMoney = "EUR";
                    tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (EUR): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser,tasaDeCambio);
                    System.out.println("Resultado de conversión: "+String.format("%.2f",conversion) +" EUR");
                    break;
                case 4:
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (MXN): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        }
    }
}

