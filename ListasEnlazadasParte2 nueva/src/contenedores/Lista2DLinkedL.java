package contenedores;
import recursos.*;

// lista ordenada
public abstract class Lista2DLinkedL extends Lista0DLinkedL implements OperacionesCL4 {
	
	// insercion ordenada
	public void insertar(Object elemento) {
		NodoDoble nodo;

		if (estaVacia()) {
			this.frenteL = this.finalL = new NodoDoble(elemento);
			
		} else{
			if (esMenor(elemento, this.frenteL.getNodoInfo())) {		//insercion al frente
				this.frenteL = new NodoDoble(elemento, null, this.frenteL); // nuevo frente
				this.frenteL.getNextNodo().setPrevNodo(this.frenteL); // vamos al 2do y conectamos con el 1ero
				
			}else{
				
				if (esMayor(elemento, this.finalL.getNodoInfo()) || iguales(elemento, this.finalL.getNodoInfo())) {	//insercion al final, si es igual no puede ponerse antes.
					//Completar!!!
					//dudoso falta
					this.finalL = new NodoDoble(elemento,this.finalL,null);//Insersion al final y el sig apunta a next
					this.finalL.getPrevNodo().setNextNodo(this.finalL); // conecta los nodo penultimo y ultimo

				}else{				
					//insercion al medio
					NodoDoble temp = this.frenteL;
					boolean flag = false;
					while (temp.getNextNodo() != null && !flag) {
						if (esMayor(elemento, temp.getNextNodo().getNodoInfo()) || iguales(elemento, temp.getNextNodo().getNodoInfo())) {
							temp = temp.getNextNodo();
						}else{
							flag = true;
						}
					}				
					
					// insercion al medio. entre temp y temp.next				
					nodo = new NodoDoble(elemento, temp, temp.getNextNodo());
					temp.getNextNodo().setPrevNodo(nodo);
					temp.setNextNodo(nodo);	
				}
			}
		}
		
		this.ultimo++; // incrementamos "ultima posicion" de lista
	}	
	
	public abstract boolean iguales(Object elemento1, Object elemento2);
	public abstract boolean esMenor(Object elemento1, Object elemento2);
	public abstract boolean esMayor(Object elemento1, Object elemento2);
	
	// implementar algun metodo de busqueda
	/*public int buscar(Object elemento){
		// implementar!!!
		int posicion =-1;
		int contador=0;
		Object unElemento;
		NodoDoble temp;
		temp=this.frenteL;
		while (temp != null && posicion == -1) {
			unElemento = temp.getNodoInfo();
			if (iguales(unElemento,elemento)) {
				posicion = contador;
			}else{
				temp = temp.getNextNodo();
				contador++;
			}
		}	

		return posicion;
	}*/
	//Busqueda Binaria en lista
	public int buscar(Object elemento){
		int ini=0;
		int fin = tamanio()-1;
		int med = (ini+fin)/2;
		Object temp;
		temp= devolver(med);

		while(ini<=fin && !iguales(temp,elemento)){
			if(esMayor(temp, elemento)){
				fin=med-1;
			}else{
				ini=med+1;
			}
			med=(ini+fin)/2;
			temp=devolver(med);
		}
		if(ini<=fin){
			return med;
		}else{
			return -1;
		}
		
	}
	
}
