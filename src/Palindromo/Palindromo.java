package Palindromo;

public class Palindromo {
    public static boolean Palindrom(String texto) {
        String limpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverso = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(reverso);
    }
}
