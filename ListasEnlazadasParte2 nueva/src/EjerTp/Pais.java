package EjerTp;

public class Pais {
    private String pais;
    private int ganados;
    private int perdidos;
    public Pais(String pais,int ganados,int perdidos){
        this.pais = pais;
        this.ganados= ganados;
        this.perdidos = perdidos;
    }
    public String getPais() {
        return this.pais;
    }
    public int getGanados() {
        return this.ganados;
    }
    public int getPerdidos() {
        return this.perdidos;
    }
    public String toString(){
        String cadena  = "";
        cadena += "Pais: " + getPais() + " PG:" + getGanados() + " PP:" + getPerdidos();
        return cadena ;
    }
}
