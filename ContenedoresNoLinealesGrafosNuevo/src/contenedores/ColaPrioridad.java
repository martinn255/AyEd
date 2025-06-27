package contenedores;
import recursos.Nodo;
//La cola de prioridad es igual a una cola colun solo que se va ordenando segun su prioridad osea
//de menor a mayor
public abstract class ColaPrioridad extends ColaLinkedList{
	public abstract boolean esMenor(Object objA, Object objB);
	public abstract boolean esMayor(Object objA, Object objB);
	public abstract boolean iguales(Object objA, Object objB);

	public void meter(Object elemento){
		Nodo node;
		node = new Nodo(elemento);
		if (estaVacia()){
			this.frenteC=this.finalC= new Nodo(elemento);
		} else{
			if (esMenor(elemento, this.frenteC.getNodoInfo())){
				node.setNextNodo(this.frenteC);
				this.frenteC=node;

			}else{
				Nodo temp = this.frenteC;
				boolean flag=false;
				while (temp.getNextNodo()!=null && !flag){
					if (esMayor(elemento,temp.getNextNodo().getNodoInfo()) ||
							iguales(elemento,temp.getNextNodo().getNodoInfo())){
						temp=temp.getNextNodo();
					}else{
						flag=true;
					}
				}
				node.setNextNodo(temp.getNextNodo());
				temp.setNextNodo(node);				
			}
		}
	}	
}
