import java.util.Random;
class RandomWords {
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
