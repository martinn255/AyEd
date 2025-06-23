import java.util.Random;

public class Proceso {
    private  static int nextId= 1;
    private int id;
    private int tiempo;
    private int cantAtenciones;

    public Proceso(){
        this.id = nextId++;
        this.tiempo= new Random().nextInt(10)+1;
        this.cantAtenciones=0;
        System.out.println("Proceso ID: " + this.id + " t:" + this.tiempo);
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Proceso.nextId = nextId;
    }

    public int getId() {
        return this.id;
    }

    public int getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCantAtenciones() {
        return cantAtenciones;
    }

    public void incCantAtenciones() {
        this.cantAtenciones++;
    }
    
}
