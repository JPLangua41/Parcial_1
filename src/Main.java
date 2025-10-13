import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short op;
        do {
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
            System.out.print("Opción: ");
            op = sc.nextShort();
            sc.nextLine();

            int dia;
            int mes;
            switch (op) {
                case 1:
                    System.out.print("HOLI UWU. \nPor favor ingresa tu día de nacimiento OwO: ");
                    dia = sc.nextInt();
                    System.out.print("Por favor ingresa tu mes de nacimiento bb: ");
                    mes = sc.nextInt();
                    String signo = Zodiaco.GiveSign(dia, mes);
                    System.out.println("\nTu signo del zodiaco es: " + signo);
                    break;
                case 2:
                    System.out.print("HOLI UWU. \nPor favor ingresa tu día de nacimiento OwO: ");
                    dia = sc.nextInt();
                    System.out.print("Por favor ingresa tu mes de nacimiento bb: ");
                    mes = sc.nextInt();
                    System.out.print("Por favor ingresea tu año de nacimiento UwU: ");
                    int anho = sc.nextInt();
                    sc.nextLine();

                    int edad = Edad.calcedad(dia, mes, anho);
                    System.out.println("OMG papu, tienes " + edad + " años :0.");
                    if (edad < 18)
                        System.out.println("JAJAJAJA, eres re menor");
                    else
                        System.out.println("Hola abuelito, ¿cómo van las rodillas?");
                    break;
                case 3:
                    System.out.println("Ingresa un número para verificar si es perfecto :p ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    if (Perfectnum.pernum(num)) {
                        System.out.println("¡OMG! \n " + num + " es un número perfecto.");
                    } else {
                        System.out.println("Nopuedeser D: \n " + num + " no es un número perfecto.");
                    }
                    break;
                case 10:
                    System.out.println("Gracias por usar mi menú :3");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
            if (op != 10) {
                System.out.println("\nPresiona Enter para continuar...");
                sc.nextLine();
            }
        } while (op != 10);
    }
}