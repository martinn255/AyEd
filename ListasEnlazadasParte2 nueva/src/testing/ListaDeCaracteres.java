package testing;
import contenedores.Lista1DLinkedL;
public class ListaDeCaracteres extends Lista1DLinkedL {
    public boolean iguales(Object elementoL, Object elemento){
        Character ch1 = (Character)elementoL;
        Character ch2 = (Character)elemento;
        return (ch1.charValue()==ch2.charValue());//la forma mas formal
        //return (ch1==ch2);    //Comun //Ya lo complete lo que faltaba
        //return Character.toLowerCase(ch1) == Character.toLowerCase(ch2); //Ignorando Mayusculas
        //foto del testeo en el fono 
    }
}
