package recursos;
//Nodo doble 
public class NodoDoble {
	private Object nodoInfo;
	private NodoDoble prevNodo, nextNodo;
	
	public NodoDoble(Object nodoInfo){
		this(nodoInfo,null,null);
	} 
	
	public NodoDoble(Object nodoInfo, NodoDoble nextNodo){
		this(nodoInfo,null,nextNodo);
	} 
	
	public NodoDoble(Object nodoInfo, NodoDoble prevNodo, NodoDoble nextNodo){
		//crea un nodo con las referencias al nodoPrev y nodoSig 
		this.nodoInfo=nodoInfo;
		this.prevNodo=prevNodo; this.nextNodo=nextNodo; 
	}
	//Informacion del Nodo previo
	public void setPrevNodo(NodoDoble prevNodo){
		this.prevNodo=prevNodo;
	}
	
	public NodoDoble getPrevNodo(){
		return this.prevNodo; 
	}
	//Informacion del Nodo sig
	public void setNextNodo(NodoDoble nextNodo){
		this.nextNodo=nextNodo;
	}
	
	public NodoDoble getNextNodo(){
		return this.nextNodo; 
	}
	//Informacion del Nodo
	public void setNodoInfo(Object nodoInfo){
		this.nodoInfo=nodoInfo; 
	}
	public Object getNodoInfo(){
		return this.nodoInfo;
	}

}
