package Capicua;

public class Capicua {
    public static boolean EsCapicua(int num)
    {
        String str = String.valueOf(num);
        String reverso = new StringBuilder(str).reverse().toString();
        return str.equals(reverso);
    }
}
