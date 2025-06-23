package testing;


public class TestPunto10 {
    public static void main(String[] args) {
        Object objAux;
        OperacionesCola nue = new OperacionesCola(10);
		Integer objInt1, objInt2, objInt3, objInt4, objInt5;
		
		objInt1 = new Integer(10);
		objInt2 = new Integer(20);
		objInt3 = new Integer(30);
		objInt4 = new Integer(40);
		objInt5 = new Integer(50);
		//Solo entran 4 en la lista de tamanio 5 porque en el vector tiene que quedar uno libre
		nue.meter(objInt1);
		nue.meter(objInt2);
		nue.meter(objInt3);
		nue.meter(objInt4);
		nue.meter(objInt5);
		
        System.out.println("Cardinal: " + nue.ObtenerCardinal());
        nue.invertirCola();
        //nueva cola para concatenar a la cola anterior   
        OperacionesCola nueva = new OperacionesCola(6);
        Integer apoyo1,apoyo2,apoyo3,apoyo4,apoyo5;
        apoyo1 = new Integer(1);
        apoyo2 = new Integer(2);
        apoyo3 = new Integer(3);
        apoyo4 = new Integer(4);
        apoyo5 = new Integer(5);
        nueva.meter(apoyo1);
        nueva.meter(apoyo2);
        nueva.meter(apoyo3);
        nueva.meter(apoyo4);
        nueva.meter(apoyo5);

        nue.concatenar(nueva);
		//System.out.println("Cardinal: " + nue.ObtenerCardinal());
		while (!nue.estaVacia()) {
			objAux = nue.sacar();		
			if (objAux != null) {
				System.out.println("Elemento Cola " + objAux.toString());
			}	
		}	
    }
}
