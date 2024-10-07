import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Digite la cantidad de pesos a convertir USD: ");
        double pesosCant = teclado.nextDouble();

        ConvertirMoneda convertir = new ConvertirMoneda();
        double convirtiendo = convertir.convertirMonedaADolar(pesosCant,tasaCambio);

        System.out.println("Resultado: "+ String.format("%.2f",convirtiendo) + "$ USD");
        */

        MenuContinentes menuCont = new MenuContinentes();
        System.out.println("¡Un gusto tenerte por aquí!, ¡Bienvenido a tú conversor de moneda!");
        String menu = "    |=!=!=| Menú principal: |=!=!| \n"+
                "¿De qué parte del mundo deseas consultar la conversión?\n"+
                "1) Norteamérica\n"+
                "2) Centroamérica\n"+
                "3) Sudamérica\n"+
                "4) El Caribe\n"+
                "5) Europa \n"+
                "6) Salir.";
        int decision = 0;
        while(decision != 6){
            System.out.println(menu);
            decision = teclado.nextInt();

            switch (decision){
                case 1:
                    menuCont.menuNorteamerica();
                    break;
                case 2:
                    menuCont.menuCentroamerica();
                case 3:
                    menuCont.menuSudamerica();
                case 4:
                    menuCont.menuCaribe();
                case 5:
                    System.out.println("fsdfs");
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta nuevamente.");
            }
        }
    }
}

