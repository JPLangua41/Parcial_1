public class Zodiaco {

    public static String GiveSign(int dia, int mes) {
        if (mes == 1) {
            if (dia >= 1 && dia <= 20) return "Capricornio";
            else if (dia > 20 && dia <= 31) return "Acuario";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 2) {
            if (dia >= 1 && dia <= 19) return "Acuario";
            else if (dia >= 20 && dia <= 29) return "Piscis";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 3) {
            if (dia >= 1 && dia <= 20) return "Piscis";
            else if (dia > 20 && dia <= 31) return "Aries";
            else return  "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 4) {
            if (dia >= 1 && dia <= 19) return "Aries";
            else if (dia >= 20 && dia <= 30) return "Tauro";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 5) {
            if (dia >= 1 && dia <= 20) return "Tauro";
            else if (dia > 20 && dia <= 31) return "Géminis";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 6) {
            if (dia >= 1 && dia <= 20) return "Géminis";
            else if (dia > 20 && dia <= 30) return "Cáncer";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 7) {
            if (dia >= 1 && dia <= 22) return "Cáncer";
            else if (dia > 22 && dia <= 31) return "Leo";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 8) {
            if (dia >= 1 && dia <= 22) return "Leo";
            else if (dia > 22 && dia <= 31) return "Virgo";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 9) {
            if (dia >= 1 && dia <= 22) return "Virgo";
            else if (dia > 22 && dia <= 30) return "Libra";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 10) {
            if (dia >= 1 && dia <= 23) return "Libra";
            else if (dia > 23 && dia <= 31) return "Escorpio";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 11) {
            if (dia >= 1 && dia <= 21) return "Escorpio";
            else if (dia > 21 && dia <= 30) return "Sagitario";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else if (mes == 12) {
            if (dia >= 1 && dia <= 22) return "Sagitario";
            else if (dia > 22 && dia <= 31) return "Capricornio";
            else return "pendejasus (ese día no esxite cabrón xd)";
        } else return "Digale al cirujano que la lobotomia fue un exito: solo existen 12 meses.";
    }
}
