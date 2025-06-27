package contenedores;
//Esta es la matriz para el Grafo
public class MatrizGrafo extends MatrizArr{
	//la cantidad de nodos
	public MatrizGrafo(int ordenGrafo){
		super(ordenGrafo, ordenGrafo);
	}
	//Verifico si dos nodos estan Conectados 
	public boolean areConnected(int i, int j){
		boolean response=false;
		if (i>=0 && i<getNroFilas() && j>=0 && j<getNroColumnas()){
			if (this.matriz[i][j]!=null){
				response=true;
			}
		}				
		return response;
	}
	
}
