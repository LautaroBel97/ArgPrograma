
import java.io.Console;
import java.util.Scanner;

public class LineSeparatorExample {
    Scanner read = new Scanner(System.in);
    Console console = System.console();
    int num;
    int num2;
    int intentos=1;
    int p1=0;
    int p2=0;
    boolean log = true;
    String rta;
    
    public LineSeparatorExample() {
    }

    public void iniciar_juego() {
        
        System.out.println("Bienvenido al juego de las adivinanzas.");
        System.out.println("Jugador 1 elige un numero y Jugador 2 debera adivinarlo.");

        
        do {
            
            char[] num1 = console.readPassword("Numero a adivinar:");
            for (int i = 0; i < num1.length; i++) {
                System.out.print("*");
            }
            System.out.println();
            num = Integer.parseInt(String.valueOf(num1));
            System.out.println("Jugador 2, adivine el numero.Tiene 5 intentos.");

            for (int i = 1; i < 6; i++) {
                System.out.print("Intento " + i + ": ");
                num2 = Integer.parseInt(read.nextLine());
                if (num2 == num) {
                    System.out.println("Numero correcto!");
                    break;
                } else {
                    System.out.println("Incorrecto! Siga intentando.");
                    intentos += 1;
                    continue;
                }
            }
            if (num2 == num) {
                System.out
                        .println("FELICIDADES! Jugador 2 adivinó el numero " + num + " en " + intentos + " intentos.");
                p2 += 1;
            } else {
                System.out.println("LO SIENTO! Agotó los intentos. Gana el Jugador 1.");
                p1 += 1;
            }

            System.out.println("Desea volver a jugar?");
            rta = read.nextLine();
            if (rta.equalsIgnoreCase("no")) {
                System.out.println("Gracias por jugar vuelva pronto!");
                log = false;
                break;
            } else {
                continue;
            }

        } while (log == true);
    }

    public static void main(String[] args) {

        LineSeparatorExample game = new LineSeparatorExample();
        game.iniciar_juego();
    }
}
