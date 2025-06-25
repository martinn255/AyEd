package testing;

import contenedores.ColaArr;
import contenedores.PilaArr;

public class OperacionesCola extends ColaArr {
    //ColaArr col;
    public OperacionesCola(int tamCola){
        super(tamCola);
        //this.col = new ColaArr(tam);
    }
    //Si no tengo los atributos de geter tengo que recorrer y guardarlos en un aux y volverlos a meter
    public int ObtenerCardinal(){
        if(!estaVacia()){
            if(this.finalC>= this.frenteC){
                return this.finalC - this.frenteC;
            }else{
                return this.tamCola -(this.frenteC-this.finalC);
            }
        }else return -1;
        
    }
    public void invertirCola(){
        PilaArr aux = new PilaArr(this.tamCola);
        if(!estaVacia()){
            while(!estaVacia()){
                aux.meter(sacar());
            }
            while(!aux.estaVacia()){
                meter(aux.sacar());
            }
        }else{
            System.out.println("La cola esta vacia no hay elementos");
        }
    }
    public void concatenar(ColaArr nueva){
        if(!estaVacia()){
            if(!nueva.estaVacia()){
                //si no agrego el esta llena aparece cola llena por si lo quiero mostar
                while(!estaLlena() && !nueva.estaVacia()){
                    meter(nueva.sacar());
                }
            }else{
                System.out.println("No hay eleemntos para agregar");
            }
        }else{
            System.out.println("Como no hay elementos se agregan los elementos de la nueva cola a la cola");
            if(!nueva.estaVacia()){
                while (!estaLlena() && !nueva.estaVacia()) {
                    meter(nueva.sacar());
                }
            }
        }
    }
}
