import Caballero.Caballero;
import Caballero.Constellation;
import Caballero.Dios;
import java.util.ArrayList;
import Capicua.Capicua;
import Edad.Edad;
import Morse.MorseTXT;
import Morse.TXTMorse;
import Palindromo.Palindromo;
import Perfectnum.Perfectnum;

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

            switch (op) {
                case 1:
                    System.out.print("Por favor ingresa tu día de nacimiento OwO: ");
                    int dia = sc.nextInt();
                    System.out.print("Por favor ingresa tu mes de nacimiento ^^: ");
                    int mes = sc.nextInt();
                    String signo = Zodiaco.GiveSign(dia, mes);
                    System.out.println("\nTu signo del zodiaco es: " + signo);
                    break;
                case 2:
                    System.out.print("Por favor ingresa tu día de nacimiento EwE: ");
                    int dia1 = sc.nextInt();
                    System.out.print("Por favor ingresa tu mes de nacimiento bb: ");
                    int mes1 = sc.nextInt();
                    System.out.print("Por favor ingresa tu año de nacimiento UwU: ");
                    int anho = sc.nextInt();
                    sc.nextLine();

                    int edad = Edad.calcedad(dia1, mes1, anho);
                    if (edad == -1) System.out.println("WTF papu, no existes :'c");
                    else {
                        System.out.println("OMG papu, tienes " + edad + " años :0.");
                        if (edad >= 0 && edad < 18)
                            System.out.println("JAJAJAJA, eres re menor");
                        else
                            System.out.println("Hola abuelito, ¿cómo van las rodillas?");
                    }
                    break;
                case 3:
                    System.out.println("Por favor ingrese un número para verificar si es perfecto :p ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    if (Perfectnum.pernum(num)) {
                        System.out.println("¡OMG! \n " + num + " es un número perfecto.");
                    } else {
                        System.out.println("Nopuedeser D: \n " + num + " no es un número perfecto.");
                    }
                    break;
                case 4:
                    System.out.println("Por favor ingrese una palabra o frase para validar si es palíndromo :v ");
                    String frase = sc.nextLine();
                    if (Palindromo.Palindrom(frase)) {
                        System.out.println("Waos, tu palabra o frase si es palindroma :O");
                    } else {
                        System.out.println("No, fuck you, tu palabra o frase no es palindroma >:(.");
                    }
                    break;
                case 5:
                    System.out.println("Por favor ingrese un número para verificar si es capicua o no ^-^");
                    int cap = sc.nextInt();
                    if (Capicua.EsCapicua(cap)) System.out.println(cap + " si es un número capicua :D");
                    else System.out.println(cap + " no es un número capicua :'(");
                    break;
                case 6:
                    System.out.println("Por favor ingrese el código Morse a traducir (usa / para separar palabras) -_- ");
                    String morseInput = sc.nextLine();
                    MorseTXT maTXT = new MorseTXT();
                    String msj = maTXT.MorseaTXT(morseInput);
                    System.out.println("Texto traducido:");
                    System.out.println(msj);
                    break;
                case 7:
                    System.out.println("Por favor ingrese el texto que deseas convertir a Morse :D ");
                    String txt = sc.nextLine();
                    TXTMorse trans = new TXTMorse();
                    String morse = trans.TXTaMorse(txt);
                    System.out.println("Texto en Morse:");
                    System.out.println(morse);
                    break;
                case 8:
                    ArrayList<Caballero> caballeros = new ArrayList<>();
                    int opi;

                    do {
                        System.out.println("Bienvenido a Saint Seiya Xenoverse >:D");
                        System.out.println("Escoja una opción: ");
                        System.out.print("1. Crear Caballero \n2. Ver info del caballero \n3. Batalla de caballeros \n4. Salir :'(\n> ");
                        opi = sc.nextInt();
                        sc.nextLine();

                        switch (opi) {
                            case 1:
                                System.out.print("Ingresa tu nombre: ");
                                String nombre = sc.nextLine();

                                System.out.println("Selecciona tu signo del zodiaco:");
                                for (Constellation s : Constellation.values()) {
                                    System.out.println("- " + s);
                                }

                                System.out.print("Escribe tu signo exactamente como aparece: ");
                                String signoInput = sc.nextLine().toUpperCase();

                                System.out.println("Selecciona tu Dios protector:");
                                for (Dios d : Dios.values()) {
                                    System.out.println("- " + d);
                                }

                                System.out.print("Escribe el nombre del Dios exactamente como aparece: ");
                                String diosInput = sc.nextLine().toUpperCase();

                                try {
                                    Constellation sign = Constellation.valueOf(signoInput);
                                    Dios dios = Dios.valueOf(diosInput);
                                    Caballero nuevo = new Caballero(nombre, sign, dios);
                                    caballeros.add(nuevo);
                                    System.out.println("¡Caballero creado exitosamente!");
                                    nuevo.mostrarDatos();
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Signo o Dios inválido. Intenta nuevamente.");
                                }
                                break;

                            case 2:
                                if (caballeros.isEmpty()) {
                                    System.out.println("No has creado ningún caballero aún.");
                                } else {
                                    System.out.println("Caballeros registrados:");
                                    for (int i = 0; i < caballeros.size(); i++) {
                                        System.out.println("\nCaballero #" + (i + 1));
                                        caballeros.get(i).mostrarDatos();
                                    }
                                }break;

                            case 3:
                                System.out.println("Función de batalla aún no implementada.");
                                break;

                            case 4:
                                System.out.println("Gracias por jugar Saint Seiya Xenoverse B)");
                                break;

                            default:
                                System.out.println("Opción inválida, intentalo de nuevo dumbass.");
                        }

                        if (opi != 4) {
                            System.out.println("\nPresione Enter para continuar...");
                            sc.nextLine();
                        }
                    } while (opi != 4);
                    break;
                case 9:
                    String word = RandomWords.GenWords();
                    int intentos = 5;

                    System.out.println("¡Bienvenido a Wordle UwU!");
                    System.out.println("Adivina la palabra de 5 letras :D. \nTienes " + intentos + " intentos >:)");

                    while (intentos > 0) {
                        System.out.print("\nIntento #" + (6 - intentos) + ": ");
                        String intento = sc.nextLine().toUpperCase();

                        if (intento.length() != 5) {
                            System.out.println("La palabra debe tener exactamente 5 letras -_-");
                            continue;
                        }

                        String pista = Wordle.Hint(word, intento);
                        System.out.println("Como vas: " + pista);

                        if (intento.equals(word)) {
                            System.out.println("¡Felicidades! Adivinaste la palabra :D \nSi tuvieras un papá estaría orgulloso :')");
                            break;
                        }

                        intentos--;
                    }

                    if (intentos == 0) {
                        System.out.println("\nLo siento papu, se acabaron los intentos :'c");
                        System.out.println("La palabra era: " + word);
                    }
                    break;
                case 10:
                    System.out.println("Gracias por usar mi menú :3");
                    break;
                default:
                    System.out.println("Opción inválida, intentalo de nuevo dumbass.");
            }
            if (op != 10) {
                System.out.println("\nPresione Enter para continuar...");
                sc.nextLine();
            }
        } while (op != 10);
    }
}