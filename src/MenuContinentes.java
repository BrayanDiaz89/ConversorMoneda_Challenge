import java.util.*;

public class MenuContinentes {
    private Scanner teclado = new Scanner(System.in);
    ConsultaMoneda consulta = new ConsultaMoneda();
    private Double cantidadMoneyUser;
    private String symbolMoney;
    private Double conversion;
    private String resultado;
    private Double tasaDeCambio;
    private List<String> historial = new ArrayList<>();

    public List<String> getHistorial() {
        List<String> historialFormateado = new ArrayList<>();
        for (int i = 0; i < historial.size(); i++){
            historialFormateado.add("Consulta "+(i+1)+": "+ historial.get(i));
        }
        return historialFormateado;
    }

    ConvertirMoneda conversor = new ConvertirMoneda();

    public void mensajeResultadoUsd(double cantidadMoneyUser, String nombreMoneda, double conversion){
        this.resultado ="La cantidad "+"("+cantidadMoneyUser+") "+nombreMoneda+" son: "+String.format("%.2f",conversion) +" USD";
        historial.add(resultado);
        System.out.println(resultado);
    }
    public void mensajeResultadoMoneda(double cantidadMoneyUser,  double conversion, String nombreMoneda){
        this.resultado ="La cantidad "+"("+cantidadMoneyUser+") "+"USD"+" son: "+String.format("%.2f",conversion)+" "+nombreMoneda;
        historial.add(resultado);
        System.out.println(resultado);
    }

    public String getSymbolMoney() {
        return symbolMoney;
    }

    public void setSymbolMoney(String symbolMoney) {
        this.symbolMoney = symbolMoney;
    }

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
            try{
                decisionUser = teclado.nextInt();
                switch (decisionUser) {
                    case 1:
                        while (true){
                            symbolMoney = "CAD";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares canadienses a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser,tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser,"dólares canadienses",conversion);
                                break;
                            }catch (InputMismatchException e){
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            symbolMoney = "CAD";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CAD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "dólares canadienses");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            symbolMoney = "MXN";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de pesos mexicanos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "pesos mexicanos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 4:
                        while (true) {
                            symbolMoney = "MXN";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (MXN): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "pesos mexicanos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo por favor.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada no válida. Por favor ingrese un valor numérico.");
                teclado.nextLine();
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
            try{
                decisionUser = teclado.nextInt();
                switch (decisionUser) {
                    case 1:
                        while (true) {
                            symbolMoney = "GTQ";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de quetzales a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "quetzales", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            symbolMoney = "GTQ";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (GTQ): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "quetzales");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            symbolMoney = "HNL";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de Lempiras a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "lempiras", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 4:
                        while (true) {
                            symbolMoney = "HNL";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (HNL): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "lempiras");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 5:
                        while (true) {
                            symbolMoney = "NIO";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de Córdobas Nicaguarenses a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "córdobas nicaguarenses", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 6:
                        while (true) {
                            symbolMoney = "NIO";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (NIO): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "córdobas nicaguarenses");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 7:
                        while (true) {
                            symbolMoney = "CRC";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de Colones Costaricenses a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "colones costaricenses", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 8:
                        while (true) {
                            symbolMoney = "CRC";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CRC): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "colones costaricenses");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 9:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo por favor.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada no válida. Por favor ingrese un valor numérico.");
                teclado.nextLine();
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

        while (decisionUser != 15) {
            System.out.println(sudamerica);
            try{
                decisionUser = teclado.nextInt();
                switch (decisionUser) {
                    case 1:
                        while (true) {
                            symbolMoney = "COP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de pesos colombianos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "pesos colombianos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            symbolMoney = "COP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (COP): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "pesos colombianos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            symbolMoney = "VES";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de Bolívares a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "bolivares", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 4:
                        while (true) {
                            symbolMoney = "VES";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (VES): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "bolivares");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 5:
                        while (true) {
                            symbolMoney = "PEN";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de soles peruanos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "soles peruanos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 6:
                        while (true) {
                            symbolMoney = "PEN";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (PEN): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "soles peruanos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 7:
                        while (true) {
                            symbolMoney = "BOB";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de bolivianos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "bolivianos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 8:
                        while (true) {
                            symbolMoney = "BOB";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (BOB): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "bolivianos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 9:
                        while (true) {
                            symbolMoney = "PYG";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de guaraníes a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "guaraníes", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 10:
                        while (true) {
                            symbolMoney = "PYG";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (PYG): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "guaraníes");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 11:
                        while (true) {
                            symbolMoney = "UYU";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de pesos uruguayos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "pesos uruguayos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 12:
                        while (true) {
                            symbolMoney = "UYU";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (UYU): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "pesos uruguayos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 13:
                        while (true) {
                            symbolMoney = "CLP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de pesos chilenos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "pesos chilenos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 14:
                        while (true) {
                            symbolMoney = "CLP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CLP): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "pesos chilenos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 15:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada no válida. Por favor ingrese un valor numérico.");
                teclado.nextLine();
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

        while (decisionUser != 9) {
            System.out.println(caribe);
            try {
                decisionUser = teclado.nextInt();
                switch (decisionUser) {
                    case 1:
                        while (true) {
                            symbolMoney = "CUP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de pesos cubanos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "pesos cubanos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            symbolMoney = "CUP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CUP): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "pesos cubanos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            symbolMoney = "DOP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de pesos dominicanos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "pesos dominicanos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 4:
                        while (true) {
                            symbolMoney = "DOP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (DOP): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "pesos dominicanos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 5:
                        while (true) {
                            symbolMoney = "HTG";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de gourdes a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "gourdes", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 6:
                        while (true) {
                            symbolMoney = "HTG";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (HTG): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "gourdes");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 7:
                        while (true) {
                            symbolMoney = "JMD";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares jamaiquinos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "dólares jamaiquinos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 8:
                        while (true) {
                            symbolMoney = "JMD";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (JMD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "dólares jamaiquinos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 9:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada no válida. Por favor ingrese un valor numérico.");
                teclado.nextLine();
            }
        }
    }

    public void menuEuropa() {
        String europa = "Estás en Europa:  \n" +
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

        while (decisionUser != 16) {
            System.out.println(europa);
            try{
                decisionUser = teclado.nextInt();
                switch (decisionUser) {
                    case 1:
                        ArrayList<String> paisesEuro = new ArrayList<>();
                        Collections.addAll(paisesEuro, "Alemania","Francia","España","Italia","Portugal",
                                "Bélgica","Países Bajos","Austria","Finlandia","Irlanda","Luxemburgo",
                                "Grecia","Eslovaquia","Eslovenia","Estonia","Letonia","Lituania","Chipre","Malta");
                        Collections.sort(paisesEuro);
                        System.out.println("Los países europeos que utilizan la moneda (Euro) son: ");
                        for(String pais : paisesEuro){
                            System.out.println(pais);
                        }
                        break;
                    case 2:
                        while (true) {
                            symbolMoney = "EUR";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de Euros a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "Euros", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            symbolMoney = "EUR";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (EUR): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "Euros");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 4:
                        while (true) {
                            symbolMoney = "GBP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de libras esterlinas a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "libras esterlinas", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 5:
                        while (true) {
                            symbolMoney = "GBP";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (GBP): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "libras esterlinas");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 6:
                        while (true) {
                            symbolMoney = "CHF";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de francos suizos a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "francos suizos", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 7:
                        while (true) {
                            symbolMoney = "CHF";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (CHF): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "francos suizos");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 8:
                        while (true) {
                            symbolMoney = "NOK";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de coronas noruegas a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "coronas noruegas", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 9:
                        while (true) {
                            symbolMoney = "NOK";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (NOK): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "coronas noruegas");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 10:
                        while (true) {
                            symbolMoney = "UAH";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de grivnas a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "grivnas", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 11:
                        while (true) {
                            symbolMoney = "UAH";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (UAH): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "grivnas");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 12:
                        while (true) {
                            symbolMoney = "ISK";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de coronas irlandesas a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "coronas irlandesas", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 13:
                        while (true) {
                            symbolMoney = "ISK";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (ISK): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "coronas irlandesas");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 14:
                        while (true) {
                            symbolMoney = "RSD";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dinares serbios a convertir a (USD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.convertirMonedaADolar(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoUsd(cantidadMoneyUser, "dinares serbios", conversion);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 15:
                        while (true) {
                            symbolMoney = "RSD";
                            tasaDeCambio = consulta.buscaMoneda(symbolMoney);
                            System.out.println("Digite la cantidad de dólares estadounidenses a convertir a (RSD): ");
                            try {
                                cantidadMoneyUser = teclado.nextDouble();
                                conversion = conversor.conversionDolarAMoneda(cantidadMoneyUser, tasaDeCambio);
                                mensajeResultadoMoneda(cantidadMoneyUser, conversion, "dinares serbios");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada no válida. Por favor ingresa un valor numérico (En caso de separar utilizar la ,)");
                                teclado.nextLine();
                            }
                        }
                        break;
                    case 16:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada no válida. Por favor ingrese un valor numérico.");
                teclado.nextLine();
            }
        }
    }
}

