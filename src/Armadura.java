public class Armadura {
    String name;
    Tipo material;
    Weapons armas;
    public Armadura(String name, Weapons armas, Tipo material) {
        this.name = name;
        this.armas = armas;
        this.material = material;
    }

    public void mostrarDatos() {
        System.out.println("Armadura: " + name);
        System.out.println(" - Arma: " + armas);
        System.out.println(" - Material: " + material);
    }

    public Weapons getArma() {
        return armas;
    }

}