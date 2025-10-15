import java.util.Scanner;

public class Batalla {
    private final Caballero jugador1;
    private final Caballero jugador2;
    private final Scanner sc;
    private boolean defensorDefendiendo = false;

    public Batalla(Caballero jugador1, Caballero jugador2, Scanner sc) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.sc = sc;
        this.jugador1.setVida(20);
        this.jugador2.setVida(20);
    }

    public void iniciar() {
        boolean turnoJugador1 = true;

        while (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
            Caballero atacante = turnoJugador1 ? jugador1 : jugador2;
            Caballero defensor = turnoJugador1 ? jugador2 : jugador1;

            System.out.println("\nTurno de " + atacante.getNombre());
            System.out.print("¿Deseas atacar (a) o defenderte (d)? ");
            String accion = sc.nextLine().toLowerCase();

            if (accion.equals("a")) {
                int danho = atacante.calcularAtaque();

                if (defensorDefendiendo) {
                    danho -= defensor.calcularDefensa();
                    danho = Math.max(0, danho);
                    System.out.println(defensor.getNombre() + " se defendió y redujo el daño.");
                    defensorDefendiendo = false;
                } else {
                    danho -= defensor.calcularDefensa() / 2;
                    danho = Math.max(1, danho);
                }

                defensor.setVida(defensor.getVida() - danho);
                System.out.println(atacante.getNombre() + " atacó y causó " + danho + " de daño.");
            } else {
                defensorDefendiendo = true;
                System.out.println(atacante.getNombre() + " se preparó para defenderse.");
            }

            System.out.println("Vida de " + jugador1.getNombre() + ": " + jugador1.getVida());
            System.out.println("Vida de " + jugador2.getNombre() + ": " + jugador2.getVida());

            turnoJugador1 = !turnoJugador1;
            System.out.println("\nPresiona Enter para continuar...");
            sc.nextLine();
        }

        if (jugador1.getVida() <= 0) {
            System.out.println("¡" + jugador2.getNombre() + " ganó la batalla!");
        } else {
            System.out.println("¡" + jugador1.getNombre() + " ganó la batalla!");
        }
    }
}

