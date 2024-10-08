import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        String respuesta = "0";
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
            decision = teclado.nextInt();

            switch (decision){
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
                    System.out.println(menuCont.getHistorial());
                    break;
                case 7:
                    //while(true){
                        System.out.println("¿Deseas generar un archivo JSON con tú historial de conversiones realizadas? 1=SI / 2=NO");
                        respuesta = teclado.nextLine();
                        if (respuesta.isEmpty()) {
                            System.out.println("No ingresaste ningún valor.");
                        }
                        if (respuesta == "1"){
                            System.out.println("Generando archivo JSON...");
                            System.out.println("Saliendo del programa.");
                            generador.guardarJson(menuCont);
                            break;
                        } else if (respuesta == "2"){
                                System.out.println("Saliendo del programa...");
                            break;
                        } else{
                                System.out.println("Valor ingresado no válido, intente nuevamente.");
                                break;
                        }
                default:
                    System.out.println("Opción no válida, por favor intenta nuevamente.");
                    break;
            }
        }
    }
}

