package recursos;
//las listas simples y listas ordenadas comparten estas
public interface OperacionesCL2 {
	public int buscar(Object elemento);
	public Object devolver(int posicion);
	public void eliminar(int posicion);
	public void limpiar();
	public boolean estaVacia();		
	public int tamanio();
}



