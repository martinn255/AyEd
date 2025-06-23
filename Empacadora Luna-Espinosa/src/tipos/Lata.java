package tipos;
import java.util.Random;

import fecha.*;
public class Lata {
    private int codigo;
    private Fecha fechaVen;
    private String tipoDeAtun;
    public double peso;
    public Lata(){
        this.codigo= new Random().nextInt(99)+1;
        this.fechaVen = new Fecha();
        int n = new Random().nextInt(2)+1;
        if(n==1){
            this.tipoDeAtun="aceite";
        }else{
            this.tipoDeAtun="natural";
        }
        double auxpeso = new Random().nextDouble(500-250+1)+250;
        this.peso= Math.round(auxpeso*1000.0)/1000.0;

    }
    public int getCodigo() {
        return this.codigo;
    }
    public Fecha getFechaVen() {
        return this.fechaVen;
    }
    public String getTipoDeAtun() {
        return this.tipoDeAtun;
    }
    public double getPeso() {
        return this.peso;
    }
    public String toString(){
        String cadena = "";
        cadena += "Cod:" + "LAT-0" + getCodigo() + "  Fecha Ven:" + getFechaVen() + "  Tipo:" + getTipoDeAtun() + "  Peso:" + getPeso();
        return cadena;
    }
}
