package EjerTp;

public class TestPunto4 {
    public static void main(String[] args) {
        Pais nue1 = new Pais("argentina", 7, 3);
        Pais nue2 = new Pais("brasil", 8, 2);
        Pais nue3 = new Pais("uruguay", 6, 4);
        Pais nue4 = new Pais("espania", 5, 5);
        Pais nue5 = new Pais("andorra", 7, 3);

        ListaDePaises listaP = new ListaDePaises();
        listaP.insertar(nue1);
        listaP.insertar(nue2);
        listaP.insertar(nue3);
        listaP.insertar(nue4);
        listaP.insertar(nue5);

        listaP.muestra();
    }
}
