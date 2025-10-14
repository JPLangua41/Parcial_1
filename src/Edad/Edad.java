package Edad;

public class Edad {
    public static int calcedad(int dia, int mes, int anho) {
        int anioActual = 2025;
        int mesActual = 10;
        int diaActual = 15;
        int edad = anioActual - anho;
        boolean Valid = true;

        if (anho > anioActual) {
            System.out.println("Aún no estamos en ese año bb");
            Valid = false;
        }

        if (mes < 1 || mes > 12) {
            System.out.println("Ese mes no existe loco ._.");
            Valid = false;
        }
        
        if (mes == 2 && dia > 29) {
            System.out.println("Febrero no tiene tantos días brother :'(");
            Valid = false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Ese mes solo tiene 30 días brother :'(");
            Valid = false;
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
            System.out.println("Ese mes no tiene más de 31 días brother :'(");
            Valid = false;
        }

        if (anho == anioActual && (mes > mesActual || (mes == mesActual && dia > diaActual))) {
            Valid = false;
        }
        if (!Valid) {
            return -1; 
        }

        if ((mes > mesActual) || (mes == mesActual && dia > diaActual)) {
            edad--;
        }return edad;
    }
}