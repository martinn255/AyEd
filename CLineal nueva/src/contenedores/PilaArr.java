package contenedores;
import recursos.*;

public class PilaArr implements OperacionesCL1 {
	//private Object[] pila;
	//private int cabeza;
	//private int tamPila;

	protected Object[] pila;
	protected int cabeza;
	protected int tamPila;
	
	public PilaArr(int tamPila) {
		//ingresa el tamanio de la pila
		this.tamPila = tamPila;
		//ingreso al array el tamanio
		this.pila = new Object[this.tamPila];
		//el limpiar pone la cabeza en -1
		limpiar(); 
	}
	
	public void meter(Object elemento) {
		if (!estaLlena()){
		  incrementaCabeza();
		  this.pila[this.cabeza] = elemento;
		} else {
			System.out.println("Error. Pila llena..");
		}
	}
	
	public Object sacar() {
		Object elemento = null;
		if (!estaVacia()){
			elemento = this.pila[this.cabeza];
			decrementaCabeza();
		} else {
			System.out.println("Error. Pila vacia..");
		}
		return elemento; 
	}

	public void limpiar() {
		this.cabeza = -1; 
	}
	
	public boolean estaLlena() {
		//pregunta si la cabeza es igual al tamanio -1 porque comienza en 0
		return (this.cabeza == this.tamPila - 1);
	}	
		
	public boolean estaVacia() {
		return (this.cabeza == -1);
	}
	
	private void incrementaCabeza() {
		this.cabeza++; 
	}
		
	private void decrementaCabeza(){
		this.cabeza--;
	}	
	
}
