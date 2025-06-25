package contenedores;
import recursos.*;
	//en una cola de array si tengo tamanio 5 solo voy a poder utlizar 4 de ellos
	//Porque hace un recorrido circular
public class ColaArr implements OperacionesCL1{
	//private Object[] cola;
	//private int finalC, frenteC;
	//private int tamCola;
	
	protected Object[] cola;
	protected int finalC, frenteC;
	protected int tamCola;

	public ColaArr(int tamCola) {
		this.tamCola = tamCola;
		this.cola = new Object[this.tamCola];
		//tanto frente como final los pone al final de la cola
		limpiar(); 
	}

	public void limpiar() {
		this.finalC = this.frenteC = tamCola - 1;
	}

	public void meter(Object elemento) {
		if (!estaLlena()) {
			if (this.finalC == this.tamCola - 1){
				this.finalC = 0;
			}else{
				incrementaFinal(); 
			}
			this.cola[this.finalC] = elemento;
		} else {
				System.out.println("Error. Cola llena...");
			}
	}
	
	
	public boolean estaLlena() {
		int p;
		if (this.finalC == this.tamCola - 1){
			p = 0;
		}else{
			p = this.finalC + 1;
		}
		//si frente como final son iguales entonces esta llena 
		//tener en cuenta que final +1 porque hay un elemento que no se usara
		return (p == this.frenteC);
	}
		
	public Object sacar() {
		Object elemento = null;
		if (!estaVacia()){
			if (this.frenteC == this.tamCola - 1){
				//como frente estaba en el tamanio lo pongo en 0 porque es circular
				this.frenteC = 0;
			}else{
				incrementaFrente();
			}
			elemento = this.cola[this.frenteC];
		} else {
			System.out.println("Error. Cola vacia...");
		}
		return elemento;
	}	
	
	public boolean estaVacia() {//Completar!!!!
		//si choca final y frente entonces esta vacia
		return (this.finalC == this.frenteC);
	}

	private void incrementaFinal() { this.finalC++; }
	private void incrementaFrente() { this.frenteC++; }	
	
	
}