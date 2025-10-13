public class Armadura {

    String name;
    boolean status;
    Tipo material;
    boolean weapons;

    @Override
    public String toString() {
        return "La armadura "+this.name+" es de: "+this.material;
    }
}