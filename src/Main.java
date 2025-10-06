import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        short op;
        do  {
            System.out.println("Bienvenido al menú de funcionalidades varias :D");
            System.out.println("Por favor escoja una de las siguientes funciones:");
            System.out.println("1. Zodiaco");
            System.out.println("2. Validador de mayoría de edad");
            System.out.println("3. Validador de número perfecto");
            System.out.println("4. Validador de palindromo");
            System.out.println("5. Validador de capicua");
            System.out.println("6. Conversor de morse a texto");
            System.out.println("7. Conversor de texto a morse");
            System.out.println("8. Gestor de caballeros del Zodiaco");
            System.out.println("9. Wordle");
            System.out.println("10. Salir :'c");
            System.out.println("Opción: ");
            op = leer.nextShort();

        } while (op != 10);
        System.out.println("Gracias por usar mi menú :3");
    }
}