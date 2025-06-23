package tipos;
import contenedores.*;
public class Auxiliar {
    private PilaArr pila;
    private PilaArr pilaAux;
    public Auxiliar(int tam,int tamAux){
        this.pila= new PilaArr(tam);
        this.pilaAux= new PilaArr(tamAux);
    }
    public void apilar(Object obj){
        Lata aux =(Lata)obj;
            
        if(!this.pila.estaLlena()){
            this.pila.meter(aux);
            //System.out.println("Lata LAT-0" + aux.getCodigo() + " apilada en Pila A");
        } else{
            //System.out.println("Pila llena! Usando PilaAux para LAT-0" + aux.getCodigo());
            this.pilaAux.meter(aux);
        }    
        
    }
    public boolean pilaAuxLlena(){
        return this.pilaAux.estaLlena();
    }
    public boolean pilaAuxVacia(){
        return this.pilaAux.estaVacia();
    }
    public void mostarPila(){
        int cont=0;
        String cadena="";
        while(!this.pila.estaVacia()){
            Lata aux = (Lata)this.pila.sacar();
            cadena += "LAT-0" + aux.getCodigo()  + "   ";
            cont++;
            //System.out.println("En Pila A: " + aux.toString());
        }
        System.out.println("Pila contiene " + cont + " Latas " + cadena);
        cont=0;
        String cadena1="";
        if(!this.pilaAux.estaVacia()){
            while(!this.pilaAux.estaVacia()){
                Lata aux1 = (Lata)this.pilaAux.sacar();
                cadena1 += "LAT-0" + aux1.getCodigo()  + "   ";
                cont++;
                //System.out.println("En Pila auxA: " + aux1.toString());
            }
            System.out.println("Pila aux  contiene " + cont + " Latas " + cadena1);
        }else{
            System.out.println("No se uso aux");
        }
    }
}
