import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        MenuContinentes menuCont = new MenuContinentes();
        GeneradorDeArchivo generador = new GeneradorDeArchivo();
        System.out.println("¡Un gusto tenerte por aquí!, ¡Bienvenido a tú conversor de moneda!");
        String menu = "    |=!=!=| Menú principal: |=!=!| \n"+
                "¿De qué parte del mundo deseas consultar la conversión?\n"+
                "1) Norteamérica\n"+
                "2) Centroamérica\n"+
                "3) Sudamérica\n"+
                "4) El Caribe\n"+
                "5) Europa \n"+
                "6) Ver historial de conversiones \n"+
                "7) Salir.";
        int decision = 0;
        while(decision != 7){
            System.out.println(menu);
            try {
                decision = teclado.nextInt();

                switch (decision) {
                    case 1:
                        menuCont.menuNorteamerica();
                        break;
                    case 2:
                        menuCont.menuCentroamerica();
                        break;
                    case 3:
                        menuCont.menuSudamerica();
                        break;
                    case 4:
                        menuCont.menuCaribe();
                        break;
                    case 5:
                        menuCont.menuEuropa();
                        break;
                    case 6:
                        if (!menuCont.getHistorial().isEmpty()){
                            System.out.println(menuCont.getHistorial());
                            break;
                        }
                        System.out.println("Historial vacío. Realiza consultas para llenarlo.");
                        break;
                    case 7:
                        String mensaje = "¿Deseas generar un archivo JSON con tú historial de conversiones realizadas? 1=SI / 2=NO";
                        int respuesta;
                            while (true) {
                                System.out.println(mensaje);
                                try {
                                    respuesta = teclado.nextInt();
                                    if (respuesta == 1) {
                                        if (!menuCont.getHistorial().isEmpty()) {
                                            generador.guardarJson(menuCont);
                                            System.out.println("Generando archivo JSON...");
                                            System.out.println("Saliendo del programa.");
                                            break;
                                        }
                                        System.out.println("Historial vacío, no es posible generar un archivo sin datos.");
                                        System.out.println("Saliendo del programa.");
                                        break;
                                    } else if (respuesta == 2) {
                                        System.out.println("Gracias por tú actividad.");
                                        System.out.println("Saliendo del programa.");
                                        break;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Entrada no válida. Por favor, ingresa un número (1=SI, 2=NO).");
                                    teclado.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Ocurrió un error inesperado.");
                                    System.out.println("Saliendo del programa.");
                                }
                            }
                        break;
                    default:
                        System.out.println("Opción no válida, por favor intenta nuevamente.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada no válida. Por favor, ingresa un valor numérico.");
                teclado.nextLine();
            }
        }
    }
}

