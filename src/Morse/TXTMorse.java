package Morse;

public class TXTMorse extends VocabMorse {
    public String TXTaMorse(String txt) {
        StringBuilder res = new StringBuilder();
        txt = txt.toUpperCase();

        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            boolean find = false;

            for (int j = 0; j < caracteres.length; j++) {
                if (caracteres[j] == c) {
                    res.append(morse[j]).append(" ");
                    find = true;
                    break;
                }
            } if (!find) res.append("? ");
        } return res.toString().trim();
    }
}

