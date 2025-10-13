package Caballero;

public class Caballero {
    String nombre;
    Constellation constellation;
    int cosmos;
    Dios dios;
    Armadura armadura;


    public Caballero(String nombre, Constellation constellation) {
        this.nombre = nombre;
        this.constellation = constellation;
    }

    //Constructor por defecto
    public Caballero() {
    }

    //Sobrecarga de metodos
    public void burnCosmos(){
        System.out.println(this.constellation +" esta usando "+(this.cosmos*2)+" cosmos");
        this.cosmos=this.cosmos-10;
    }
    public void burnCosmos(int c)
    {
        this.cosmos=this.cosmos*c;
    }
}