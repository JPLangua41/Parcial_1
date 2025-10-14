package Caballero;

public class Caballero {
    String nombre;
    Constellation constellation;
    Dios dios;
    Armadura armadura;

    public Caballero(String nombre, Constellation signo, Dios dios) {
        this.nombre = nombre;
        this.constellation = signo;
        this.dios =dios;
        this.armadura = new Armadura();
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Signo del Zodiaco: " + constellation);
        System.out.println("Dios protector: " + dios);
    }
}