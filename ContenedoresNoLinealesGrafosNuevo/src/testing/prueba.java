package testing;
import grafoDirigido.*;
public class prueba {
    public static void main(String[] args) {
        //GrafoDirigido grafos;
        //int grado = 6;
        //grafos = new GrafoDirigido(grado);
        //grafos.cargarGrafoDeMano();
        //grafos.cargarGrafo();
        //grafos.muestraGrafo();
        //grafos.muestraDijkstra(0);
        //grafos.muestraFloyd();
        //grafos.muestraCaminoFloyd(1, 5);

        GrafoDirigido logi;
        int grado =10;
        logi = new GrafoDirigido(grado);
        logi.cargaCiudad();
        logi.muestraGrafo();
        logi.muestraDijkstra(0);

        //logi.muestraFloyd();
        //logi.muestraCaminoFloyd(0, 9);


    }
}
