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
                    System.out.println("Digite la cantidad de dólares canadienses a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
                    break;
                case 2:
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CAD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
                    break;
                case 3:
                    System.out.println("Digite la cantidad de pesos mexicanos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
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

    public void menuCaribe() {
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
                    System.out.println("Digite la cantidad de dólares canadienses a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
                    break;
                case 2:
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CAD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
                    break;
                case 3:
                    System.out.println("Digite la cantidad de pesos mexicanos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
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

    public void menuEuropa() {
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
                    System.out.println("Digite la cantidad de dólares canadienses a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
                    break;
                case 2:
                    System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CAD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
                    break;
                case 3:
                    System.out.println("Digite la cantidad de pesos mexicanos a convertir a (USD): ");
                    cantidadMoneyUser = teclado.nextDouble();
                    System.out.println("Su resultado es...");
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

