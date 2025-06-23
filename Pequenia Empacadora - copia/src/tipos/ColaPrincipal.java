package tipos;
import contenedores.*;
public class ColaPrincipal {
    private ColaArr colaAtun;
    private int capMax;
    public ColaPrincipal(int capMax){
        this.capMax=capMax;
        this.colaAtun = new ColaArr(this.capMax);
    }
    //Nose si va el tamanio en java
    public int getCapMax() {
        return this.capMax;
    }
    //Genera aleatoriamente las Latas para Ingresarlas a la cola
    public void generarLatas(){
        while(!this.colaAtun.estaLlena()){
            Lata nueva = new Lata();
            this.colaAtun.meter(nueva);
            //System.out.println("Elemento: " + nueva.toString());
        }
    }
    public Object sacaUnaLata(){
        Lata aux = null;
        if(!colaVacia()){
            aux = (Lata)this.colaAtun.sacar();
            //System.out.println("Elemento cola: " + aux.toString());
        }else{
            System.out.println("Cola principal Vacia");
        }
        
        return aux;
    }
    public boolean colaVacia(){
        return this.colaAtun.estaVacia();
    }
    //Muetra la cola con cada Lata
    public void mostarCola(){
        if(colaVacia()){
            System.out.println("Cola Vacia");
        }
        while (!colaVacia()) {
			Lata aux = (Lata)this.colaAtun.sacar();
            System.out.println("Restantes: " + aux.toString());
		}
        
    }

}
