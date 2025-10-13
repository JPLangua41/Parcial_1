package Morse;

public class MorseTXT extends VocabMorse {
    public String MorseaTXT(String text) {
        StringBuilder rest = new StringBuilder();
        String[] palabras = text.trim().split(" / ");

        for (String palabra : palabras) {
            String[] letras = palabra.trim().split(" ");
            for (String simbolo : letras) {
                boolean found = false;
                for (int i = 0; i < morse.length; i++) {
                    if (morse[i].equals(simbolo)) {
                        rest.append(caracteres[i]);
                        found = true;
                        break;
                    }
                } if (!found) rest.append("?");
            } rest.append(" ");
        } return rest.toString().trim();
    }
}
