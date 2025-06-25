package contenedores;
import recursos.*;


public class PilaSLinkedList implements OperacionesCL1 {
	private Nodo pila;
	
	public PilaSLinkedList() {
		//Inicializa la pila en null
		limpiar(); 
	}
	
	public void meter(Object elemento) {

		this.pila = new Nodo(elemento, this.pila);
		// la cabeza es el elemento ingresado!
	} 

	public boolean estaVacia() {
		// pregunta Si el nodo es null
		return (this.pila == null);
	} 
	//Limpia toda La lista  
	public void limpiar() {
		this.pila = null;
	}
	//Saca un elemento de la lista enlazada
	public Object sacar() {
		Object elemento = null;
		if (!estaVacia()){
			//saca el elemento de la cabeza
			elemento = this.pila.getNodoInfo();
			//pasa la cabeza al siguente nodo que le sigue
			this.pila = this.pila.getNextNodo();
		}else{
			System.out.println("Error sacar. Pila vacia");}
		return elemento; 
	}
	
	public void muestra(){
		Nodo temp;
		if (!estaVacia()){
			//crea solo una copia de la pila
			temp = this.pila;
			while (temp != null){
				//muestra la cabeza
				System.out.println("Elemento " + temp.getNodoInfo().toString());
				//pasa al siguiente nodo la cabeza
				temp = temp.getNextNodo();
			}
		}else{
			System.out.println("Error muestra. Pila vacia");
		}
	}
	
}