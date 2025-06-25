package testing;
import contenedores.PilaArr;
import recursos.OperacionesTp;


//Ejercicio del Tp 6 punto 7 A,B
public class PilaArrayExtendida2 extends PilaArr implements OperacionesTp{

    public PilaArrayExtendida2(int tamPila) {
        super(tamPila);
        //TODO Auto-generated constructor stub
    }

    public Object topePila(){
        Object tope = null;
        if(!estaVacia()){
            tope = sacar();
            meter(tope);
        }
        return tope;
    }
}
