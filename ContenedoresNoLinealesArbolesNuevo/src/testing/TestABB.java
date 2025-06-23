package testing;

public class TestABB {
	public static void main(String[] args) {
		IntABB miArbol;
		
		miArbol = new IntABB();
		
		//miArbol.meter(new Integer(10));
		
		/*		
		miArbol.meter(new Integer(7));
		miArbol.meter(new Integer(5));
		miArbol.meter(new Integer(1));
		miArbol.meter(new Integer(6));
		miArbol.meter(new Integer(9));
		*/
		
		/*miArbol.meter(new Integer(20));
		miArbol.meter(new Integer(15));
		miArbol.meter(new Integer(14));
		miArbol.meter(new Integer(30));
		miArbol.meter(new Integer(10));*/

		/*miArbol.meter(new Integer(14));
		miArbol.meter(new Integer(15));
		miArbol.meter(new Integer(4));
		miArbol.meter(new Integer(9));
		miArbol.meter(new Integer(7));
		miArbol.meter(new Integer(18));
		miArbol.meter(new Integer(3));
		miArbol.meter(new Integer(5));
		miArbol.meter(new Integer(16));
		miArbol.meter(new Integer(20));
		miArbol.meter(new Integer(17));*/

		miArbol.meter(new Integer(10));
		miArbol.meter(new Integer(7));
		miArbol.meter(new Integer(20));
		miArbol.meter(new Integer(3));
		miArbol.meter(new Integer(8));
		miArbol.meter(new Integer(15));
		miArbol.meter(new Integer(35));
		miArbol.meter(new Integer(1));
		miArbol.meter(new Integer(4));
		miArbol.meter(new Integer(27));
		miArbol.meter(new Integer(38));
		miArbol.meter(new Integer(2));
		miArbol.meter(new Integer(6));

		/*miArbol.meter(new Integer(7));
		miArbol.meter(new Integer(3));
		miArbol.meter(new Integer(6));
		miArbol.meter(new Integer(1));
		miArbol.meter(new Integer(2));
		miArbol.meter(new Integer(4));
		miArbol.meter(new Integer(5));*/


		
		//miArbol.muestraInOrder();
		//miArbol.muestraPreOrder();		//El que mas se usa
		//miArbol.muestraPostOrder();
		System.out.println("***");
		//miArbol.sacar(15);
		//miArbol.sacar(7);
		//miArbol.sacar(20);
		miArbol.muestraPreOrder();



	    /*miArbol.sacar(new Integer(10));
		miArbol.muestraInOrder();*/
		System.out.println("***");

		System.out.println("la cantidad de hojas es " + miArbol.cuentaHojas());
		
		System.out.println("la altura es " + miArbol.altura());
		
		System.out.println("la cantidad de nodos es " + miArbol.cuentaNodos());
		
	}

}
