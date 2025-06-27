package contenedores;
import recursos.OperacionesG;
//im[lementa las operaciones en comun busqueda en profundidad y en amplitud
public abstract class AbsGrafo implements OperacionesG{
	protected MatrizGrafo matrizCosto;
	protected int ordenGrafo;
	protected static double infinito=10000;
	
	public AbsGrafo(int ordenGrafo) {
		this.ordenGrafo = ordenGrafo;
		this.matrizCosto = new MatrizGrafo(getOrden());
	}
	
	public int getOrden(){
		return this.ordenGrafo;
	}
	
	public abstract void cargarGrafo();
	public abstract void muestraGrafo();


	//Busqueda en Profundidad Hace el Recorrido
	private void bpf(ListaDoubleLinkedL listaMarca, int v){
		//Resive la lista y un vertice
		boolean marcado;
		double currCost;
		
		//Marco en el nodo que estoy parado
		listaMarca.reemplazar(new Boolean(true), v);
		System.out.println("vertice "+ v);
		for (int w=0;w<getOrden();w++){
			marcado=(boolean)listaMarca.devolver(w);
			currCost=(double)this.matrizCosto.devolver(v,w);
			if (currCost!=infinito && !marcado){
				//Entra solo si no esta marcado y si hay Coneccion
				bpf(listaMarca,w);
			}
		}
	}
	//Muetra la busqueda en Profundidad
	public void muestraBPF(){
		ListaDoubleLinkedL listaMarca;
		boolean marcado;
		
		listaMarca = new ListaDoubleLinkedL();
		//creo la lista con todos los nodos sin marcar por eso el false
		for (int v=0;v<getOrden();v++){
			listaMarca.insertar(false, v);
		}
		
		//Hago la busqueda y llama bpf para comparar
		for (int v=0;v<getOrden();v++){
			marcado=(boolean)listaMarca.devolver(v);
			if (!marcado){
				bpf(listaMarca,v);
			}
		}		
	}
	
	//Busqueda en Amplitud Hace el recorrido
	private void bea(ListaDoubleLinkedL listaMarca, int v){
		boolean marcado;
		double currCost;
		ColaSLinkedList cola;
		int w;
		
		//Primero marco al nodo que recibimos como visitado y mostramos cual es visitado
		listaMarca.reemplazar(true, v);
		System.out.println("vertice "+ v);
		cola = new ColaSLinkedList();
		cola.meter(v);
		
		while (!cola.estaVacia()){
			w=(int)cola.sacar();
			for (int z=0;z<getOrden();z++){
				marcado=(boolean)listaMarca.devolver(z);
				currCost=(double)this.matrizCosto.devolver(w,z);
				if (currCost!=infinito && !marcado){
					listaMarca.reemplazar(true, z);
					cola.meter(z);
					System.out.println("arista visitada " + w + " - " + z);
				}		
			}
		}
	}
	
	//Muestra la Busqueda en Amplitud 
	public void muestraBEA(){
		ListaDoubleLinkedL listaMarca;
		boolean marcado;
		
		listaMarca = new ListaDoubleLinkedL();
		for (int v=0;v<getOrden();v++){
			listaMarca.insertar(false, v);
		}
		
		for (int v=0;v<getOrden();v++){
			marcado=(boolean)listaMarca.devolver(v);
			if (!marcado){
				bea(listaMarca,v);
			}
		}		
	}
}
