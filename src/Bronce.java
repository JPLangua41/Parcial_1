public class Bronce extends Armadura{

    int durability;
    String animal;

    @Override
    public String toString() {
        return super.toString()+" animal='" + animal + '\'' +
                " ";
    }

    public Bronce(){
        super.material=Tipo.BRONCE;
        super.weapons=false;
    }

}