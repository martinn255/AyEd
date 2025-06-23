package EjerTp;

import contenedores.Lista2DLinkedL;
import recursos.NodoDoble;

public class ListaDePaises extends Lista2DLinkedL{

    public boolean iguales(Object elemento1, Object elemento2) {
        Pais c1 = (Pais)elemento1;
        Pais c2 = (Pais)elemento2;
        return c1.getGanados()-c1.getPerdidos() == c2.getGanados()-c2.getPerdidos(); 
    }

    public boolean esMenor(Object elemento1, Object elemento2) {
        Pais c1 = (Pais)elemento1;
        Pais c2 = (Pais)elemento2;
        return c1.getGanados()-c1.getPerdidos() < c2.getGanados()-c2.getPerdidos(); 
    }

    public boolean esMayor(Object elemento1, Object elemento2) {
        Pais c1 = (Pais)elemento1;
        Pais c2 = (Pais)elemento2;
        return c1.getGanados()-c1.getPerdidos() > c2.getGanados()-c2.getPerdidos();
    }
    public void muestra() {		
		NodoDoble temp;
		
		if (!estaVacia()) {
			temp=this.frenteL; // el primero
			while (temp != null){
								
				System.out.println(temp.getNodoInfo().toString());				
				temp = temp.getNextNodo(); 
			}			
		}else{
			System.out.println("Error muestra. Lista vacia");
		}		
		
	}	
    
}
