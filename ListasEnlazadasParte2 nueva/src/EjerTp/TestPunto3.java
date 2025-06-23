package EjerTp;

public class TestPunto3 {
    public static void main(String[] args) {
        ListaBinarios listaA = new ListaBinarios();
        Integer obj1, obj2, obj3, obj4, obj5, obj6;
		obj1 = new Integer(0);
		obj2 = new Integer(0);
		obj3 = new Integer(1);
		obj4 = new Integer(1);
		obj5 = new Integer(0);
		obj6 = new Integer(1);
        listaA.insertar(obj1, 0);
        listaA.insertar(obj2, 1);
        listaA.insertar(obj3, 2);
        listaA.insertar(obj4, 3);
        listaA.insertar(obj5, 4);
        listaA.insertar(obj6, 5);
        listaA.muestra();

        System.out.println();
        ListaBinarios listaB = new ListaBinarios();
        Integer obj7, obj8, obj9, obj10, obj11, obj12;
		obj7 = new Integer(0);
		obj8 = new Integer(1);
		obj9 = new Integer(1);
		obj10 = new Integer(1);
		obj11 = new Integer(0);
		obj12 = new Integer(1);
        listaB.insertar(obj7, 0);
        listaB.insertar(obj8, 1);
        listaB.insertar(obj9, 2);
        listaB.insertar(obj10, 3);
        listaB.insertar(obj11, 4);
        listaB.insertar(obj12, 5);
        listaB.muestra();
        System.out.println("Suma de las dos listas");
        ListaBinarios listaC = new ListaBinarios();
        listaC.sumaNuevalista(listaA, listaB);
        listaC.muestra();
    }
}
