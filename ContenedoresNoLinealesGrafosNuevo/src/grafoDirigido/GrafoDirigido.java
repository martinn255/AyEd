package grafoDirigido;

import java.util.Scanner;

public class GrafoDirigido extends AbsGrafoD{
	public GrafoDirigido(int ordenGrafo){
		super(ordenGrafo);
	}
	
	@Override
	public void cargarGrafo(){
		//El currCost es el Costo de las Aristas
		double currCost;		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<getOrden();i++){
			for (int j=0;j<getOrden();j++){
				if (i!=j){
					System.out.println("Ingrese costo[" + i + "," + j + "] (sino -1)");
					currCost=scanner.nextDouble();
					if (currCost!=-1){
						this.matrizCosto.actualizar(currCost, i, j);	
					}else{
						this.matrizCosto.actualizar(infinito, i, j);
					}					
				}else{
					this.matrizCosto.actualizar(infinito, i, j);
				}
			}
		} 
   	
	}
	public void cargaCiudad(){
		this.matrizCosto.actualizar(infinito,0 ,0 );//
		this.matrizCosto.actualizar(new Double(14), 0, 1);
		this.matrizCosto.actualizar(new Double(11), 0, 2);
		this.matrizCosto.actualizar(new Double(17), 0, 3);
		this.matrizCosto.actualizar(new Double(19),0 ,4 );
		this.matrizCosto.actualizar(new Double(20), 0, 5);
		this.matrizCosto.actualizar(new Double(22),0 ,6 );
		this.matrizCosto.actualizar(new Double(25), 0, 7);
		this.matrizCosto.actualizar(new Double(27),0 ,8 );
		this.matrizCosto.actualizar(new Double(30), 0, 9);

		this.matrizCosto.actualizar(new Double(13), 1, 0);
		this.matrizCosto.actualizar(infinito, 1, 1);//
		this.matrizCosto.actualizar(new Double(12), 1, 2);
		this.matrizCosto.actualizar(new Double(15), 1, 3);
		this.matrizCosto.actualizar(new Double(18),1 ,4 );
		this.matrizCosto.actualizar(new Double(21), 1, 5);
		this.matrizCosto.actualizar(new Double(23),1,6 );
		this.matrizCosto.actualizar(new Double(26), 1, 7);
		this.matrizCosto.actualizar(new Double(28),1,8 );
		this.matrizCosto.actualizar(new Double(29), 1, 9);

		this.matrizCosto.actualizar(new Double(10), 2, 0);
		this.matrizCosto.actualizar(new Double(9), 2, 1);
		this.matrizCosto.actualizar(infinito, 2, 2);//
		this.matrizCosto.actualizar(new Double(13), 2, 3);
		this.matrizCosto.actualizar(new Double(17),2 ,4 );
		this.matrizCosto.actualizar(new Double(19), 2, 5);
		this.matrizCosto.actualizar(new Double(21),2,6 );
		this.matrizCosto.actualizar(new Double(23), 2, 7);
		this.matrizCosto.actualizar(new Double(25),2,8 );
		this.matrizCosto.actualizar(new Double(27), 2, 9);

		this.matrizCosto.actualizar(new Double(9), 3, 0);
		this.matrizCosto.actualizar(new Double(10), 3, 1);
		this.matrizCosto.actualizar(new Double(8), 3, 2);
		this.matrizCosto.actualizar(infinito, 3, 3);//
		this.matrizCosto.actualizar(new Double(12),3,4 );
		this.matrizCosto.actualizar(new Double(14), 3, 5);
		this.matrizCosto.actualizar(new Double(19),3,6 );
		this.matrizCosto.actualizar(new Double(21), 3, 7);
		this.matrizCosto.actualizar(new Double(24),3,8 );
		this.matrizCosto.actualizar(new Double(26), 3, 9);

		this.matrizCosto.actualizar(new Double(8), 4, 0);
		this.matrizCosto.actualizar(new Double(9), 4, 1);
		this.matrizCosto.actualizar(new Double(10), 4, 2);
		this.matrizCosto.actualizar(new Double(11), 4, 3);
		this.matrizCosto.actualizar(infinito,4,4 );//
		this.matrizCosto.actualizar(new Double(13), 4, 5);
		this.matrizCosto.actualizar(new Double(17),4,6 );
		this.matrizCosto.actualizar(new Double(20), 4, 7);
		this.matrizCosto.actualizar(new Double(22),4,8 );
		this.matrizCosto.actualizar(new Double(25), 4, 9);

		this.matrizCosto.actualizar(new Double(7), 5, 0);
		this.matrizCosto.actualizar(new Double(8), 5, 1);
		this.matrizCosto.actualizar(new Double(9), 5, 2);
		this.matrizCosto.actualizar(new Double(10), 5, 3);
		this.matrizCosto.actualizar(new Double(11),5 ,4 );
		this.matrizCosto.actualizar(infinito, 5, 5);//
		this.matrizCosto.actualizar(new Double(15),5,6 );
		this.matrizCosto.actualizar(new Double(18), 5, 7);
		this.matrizCosto.actualizar(new Double(21),5,8 );
		this.matrizCosto.actualizar(new Double(24), 5, 9);
		
		this.matrizCosto.actualizar(new Double(6), 6, 0);
		this.matrizCosto.actualizar(new Double(7), 6, 1);
		this.matrizCosto.actualizar(new Double(8), 6, 2);
		this.matrizCosto.actualizar(new Double(9), 6, 3);
		this.matrizCosto.actualizar(new Double(10),6 ,4 );
		this.matrizCosto.actualizar(new Double(11), 6, 5);
		this.matrizCosto.actualizar(infinito,6,6 );//
		this.matrizCosto.actualizar(new Double(16), 6, 7);
		this.matrizCosto.actualizar(new Double(20),6,8 );
		this.matrizCosto.actualizar(new Double(22), 6, 9);

		this.matrizCosto.actualizar(new Double(5), 7, 0);
		this.matrizCosto.actualizar(new Double(6), 7, 1);
		this.matrizCosto.actualizar(new Double(7), 7, 2);
		this.matrizCosto.actualizar(new Double(8), 7, 3);
		this.matrizCosto.actualizar(new Double(9),7,4 );
		this.matrizCosto.actualizar(new Double(10), 7, 5);
		this.matrizCosto.actualizar(new Double(11),7,6 );
		this.matrizCosto.actualizar(infinito, 7, 7);//
		this.matrizCosto.actualizar(new Double(19),7,8 );
		this.matrizCosto.actualizar(new Double(21), 7, 9);

		this.matrizCosto.actualizar(new Double(4), 8, 0);
		this.matrizCosto.actualizar(new Double(5), 8, 1);
		this.matrizCosto.actualizar(new Double(6), 8, 2);
		this.matrizCosto.actualizar(new Double(7), 8, 3);
		this.matrizCosto.actualizar(new Double(8),8 ,4 );
		this.matrizCosto.actualizar(new Double(9), 8, 5);
		this.matrizCosto.actualizar(new Double(10),8 ,6 );
		this.matrizCosto.actualizar(new Double(11), 8, 7);
		this.matrizCosto.actualizar(infinito,8,8 );//
		this.matrizCosto.actualizar(new Double(20), 8, 9);

		this.matrizCosto.actualizar(new Double(3), 9, 0);
		this.matrizCosto.actualizar(new Double(4), 9, 1);
		this.matrizCosto.actualizar(new Double(5), 9, 2);
		this.matrizCosto.actualizar(new Double(6), 9, 3);
		this.matrizCosto.actualizar(new Double(7),9 ,4 );
		this.matrizCosto.actualizar(new Double(8), 9, 5);
		this.matrizCosto.actualizar(new Double(9),9,6 );
		this.matrizCosto.actualizar(new Double(10), 9, 7);
		this.matrizCosto.actualizar(new Double(11),9,8 );
		this.matrizCosto.actualizar(infinito, 9, 9);//

	}
	public void cargarGrafoDeMano(){
		this.matrizCosto.actualizar(infinito,0 ,0 );//
		this.matrizCosto.actualizar(new Double(20), 0, 1);
		this.matrizCosto.actualizar(new Double(5), 0, 2);
		this.matrizCosto.actualizar(infinito, 0, 3);
		this.matrizCosto.actualizar(infinito,0 ,4 );
		this.matrizCosto.actualizar(infinito, 0, 5);

		this.matrizCosto.actualizar(new Double(2), 1, 0);
		this.matrizCosto.actualizar(infinito, 1, 1);//
		this.matrizCosto.actualizar(infinito, 1, 2);
		this.matrizCosto.actualizar(infinito, 1, 3);
		this.matrizCosto.actualizar(new Double(10),1 ,4 );
		this.matrizCosto.actualizar(new Double(30), 1, 5);

		this.matrizCosto.actualizar(infinito, 2, 0);
		this.matrizCosto.actualizar(new Double(4), 2, 1);
		this.matrizCosto.actualizar(infinito, 2, 2);//
		this.matrizCosto.actualizar(infinito, 2, 3);
		this.matrizCosto.actualizar(infinito,2 ,4 );
		this.matrizCosto.actualizar(new Double(10), 2, 5);

		this.matrizCosto.actualizar(infinito, 3, 0);
		this.matrizCosto.actualizar(infinito, 3, 1);
		this.matrizCosto.actualizar(infinito, 3, 2);
		this.matrizCosto.actualizar(infinito, 3, 3);//
		this.matrizCosto.actualizar(infinito,3,4 );
		this.matrizCosto.actualizar(infinito, 3, 5);

		this.matrizCosto.actualizar(infinito, 4, 0);
		this.matrizCosto.actualizar(infinito, 4, 1);
		this.matrizCosto.actualizar(infinito, 4, 2);
		this.matrizCosto.actualizar(new Double(15), 4, 3);
		this.matrizCosto.actualizar(infinito,4,4 );//
		this.matrizCosto.actualizar(infinito, 4, 5);

		this.matrizCosto.actualizar(infinito, 5, 0);
		this.matrizCosto.actualizar(infinito, 5, 1);
		this.matrizCosto.actualizar(infinito, 5, 2);
		this.matrizCosto.actualizar(new Double(4), 5, 3);
		this.matrizCosto.actualizar(new Double(10),5 ,4 );
		this.matrizCosto.actualizar(infinito, 5, 5);//
	}

}
