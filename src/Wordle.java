import java.util.Random;

public class Wordle {
    public static String Hint(String word, String intento) {
        StringBuilder resultado = new StringBuilder();
        boolean[] usadas = new boolean[5];

        for (int i = 0; i < 5; i++) {
            if (intento.charAt(i) == word.charAt(i)) {
                resultado.append(intento.charAt(i));
                usadas[i] = true;
            } else {
                resultado.append("_");
            }
        }

        for (int i = 0; i < 5; i++) {
            if (resultado.charAt(i) != '_') continue;

            boolean encontrada = false;
            for (int j = 0; j < 5; j++) {
                if (!usadas[j] && intento.charAt(i) == word.charAt(j)) {
                    resultado.setCharAt(i, Character.toLowerCase(intento.charAt(i)));
                    usadas[j] = true;
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                resultado.setCharAt(i, '-');
            }
        }

        return resultado.toString();
    }

    static class RandomWords {
            public static String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            public static String GenWords() {
                Random rand = new Random();
                StringBuilder palabra = new StringBuilder();

                for (int i = 0; i < 5; i++) {
                    int indice = rand.nextInt(letras.length());
                    palabra.append(letras.charAt(indice));
                }
                return palabra.toString();
            }
        }
}
