package contenedores;
import recursos.*;


public class ColaSLinkedList implements OperacionesCL1 {
	private Nodo frenteC, finalC;
	
	public ColaSLinkedList() {
		//el limpiar coloca el frente y final en null
		limpiar();
	}

	public boolean estaVacia() {
		return (this.frenteC == null);
	} 

	//Ojo: este metodo fue modificado para que no funcione. corregir! ;)
	//Arrreglado
	public void meter(Object elemento) {
		if (!estaVacia()) {
			//Pone en el signodo el elemento
			this.finalC.setNextNodo(new Nodo(elemento));
			this.finalC = this.finalC.getNextNodo();
			// nuevo nodo es el ultimo.
		}else{
			//this.frenteC = null;
			//Coloca el primer elemento al frente de todo y frente y final comienzan ahi
			this.frenteC = this.finalC = new Nodo(elemento);
		}
	}
	
	public Object sacar() {
		Object elemento = null;
		if (!estaVacia()) {
			//agarra el primer elemento de la lista y lo saca 
			elemento = this.frenteC.getNodoInfo();
			//frente pasa a ser el siguiente
			this.frenteC = this.frenteC.getNextNodo();
			if (estaVacia()) {
				//cuando frente pasa a ser null pongo final tambien en null
				this.finalC = null; 
			}
		}else{
			System.out.println("Error sacar. Cola vacia");
		}
		return elemento;
	}
	
	public void limpiar() {
		//pone tanto frente como final en null
		this.frenteC = this.finalC = null;
	}	
	
}
