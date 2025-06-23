package testing;
import contenedores.*;
public class BalanceCadena {
    private PilaArr pila;
    private String cadena;
    public BalanceCadena(String cadena){
        this.cadena = cadena;
        this.pila = new PilaArr(cadena.length());
    }
    private int tamCadena(){
        return this.cadena.length();
    }
    public boolean estaBalanceada(){
        boolean balanceada = true;
        boolean band = false;
        int i=0;
        while(i< tamCadena() && balanceada==true){
            char c = this.cadena.charAt(i);
            if(c=='('){
                this.pila.meter(c);
                band = true;
            }else{
                if(c==')'){
                    if(pila.estaVacia()){
                        balanceada = false;
                    }else{
                        this.pila.sacar();
                        band = true;
                    }
                }
            }
            i++;
        }   
        if(!band){
            balanceada=false;
        }
        return balanceada;
    }
}
