public class Caballero {
    String nombre;
    Constellation constellation;
    Dios dios;
    Armadura armadura;

    public Caballero(String nombre, Constellation signo, Dios dios, Armadura armadura) {
        this.nombre = nombre;
        this.constellation = signo;
        this.dios =dios;
        this.armadura = armadura;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Signo del Zodiaco: " + constellation);
        System.out.println("Dios protector: " + dios);
        if (armadura != null) armadura.mostrarDatos();
        }
    private int vida = 20;

    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }

    public int calcularAtaque() {
        int base = constellation.getAtaque() + armadura.getArma().getDanho();
        int critico = Math.random() < 0.2 ? 2 : 1; // 20% de probabilidad de crítico
        return base * critico;
    }

    public int calcularDefensa() {
        return constellation.getDefensa() + dios.getDefensaExtra();
    }
}