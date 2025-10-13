public class Perfectnum {
    public static boolean pernum(int num) {
        if (num <= 0) return false;

        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }

        return suma == num;
    }
}
