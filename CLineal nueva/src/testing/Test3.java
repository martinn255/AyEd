package testing;

//import contenedores.PilaArr;

public class Test3 {
    public static void main(String[] args) {
        Object objAux;
        //Punto 7 del tp EL A y B Por las dudas
        PilaArrayExtendida2 objPila = new PilaArrayExtendida2(5);
        //PilaArr objPila = new PilaArr(5);
		
		Integer objInt1, objInt2, objInt3, objInt4, objInt5;
		
		objInt1 = new Integer(10);
		objInt2 = new Integer(20);
		objInt3 = new Integer(30);
		objInt4 = new Integer(40);
		objInt5 = new Integer(50);
		
		//Solo entran 4 en la lista de tamanio 5 porque en el vector tiene que quedar uno libre
		objPila.meter(objInt1);
		objPila.meter(objInt2);
		objPila.meter(objInt3);
		objPila.meter(objInt4);
		objPila.meter(objInt5);
		//objPila.meter(objInt1);
        
        System.out.println("Elemento de el tope sin sacar" + objPila.topePila());
        System.out.println();
		
		while (!objPila.estaVacia()) {
			objAux = objPila.sacar();		
			if (objAux != null) {
				System.out.println("Elemento Pila " + objAux.toString());
			}	
		}		
    }
}
