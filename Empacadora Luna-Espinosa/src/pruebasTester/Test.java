package pruebasTester;
import tipos.Auxiliar;
import tipos.ColaPrincipal;
import tipos.Lata;
import tipos.Transporte;
    //Luna Jose Matias Carrera /LAS  / Dni:43.836.664 /
    //Espinosa Martin Alejandro / LAS-TUP  / Dni:45.549.692 /
public class Test {
    public static void main(String[] args) {
        ColaPrincipal nue = new ColaPrincipal(20);
        nue.generarLatas();
        System.out.println();
        //System.out.println("Elemento Sacado:" + nue.sacaUnaLata().toString());
        int tam=30,tamAux=2;
        //Pilas
        Auxiliar pilaA = new Auxiliar(tam, tamAux);
        Auxiliar pilaB = new Auxiliar(tam, tamAux);
        //Distribucion 
        while(!pilaA.pilaAuxLlena() && !pilaB.pilaAuxLlena() && !nue.colaVacia()){
            Lata dd = (Lata)nue.sacaUnaLata();
            if(dd.getTipoDeAtun().equals("aceite")){
                pilaA.apilar(dd);
                if(pilaA.pilaAuxVacia()){
                   System.out.println("Lata LAT-0" + dd.getCodigo() + " apilada en Pila A"); 
                }else{
                    System.out.println("Pila llena! Usando PilaAuxA para LAT-0" + dd.getCodigo());
                }
                
            }else{
                pilaB.apilar(dd);
                if(pilaB.pilaAuxVacia()){
                   System.out.println("Lata LAT-0" + dd.getCodigo() + " apilada en Pila B"); 
                }else{
                    System.out.println("Pila llena! Usando PilaAuxB para LAT-0" + dd.getCodigo());
                }
            }
        }
        //
        if(pilaA.pilaAuxLlena() || pilaB.pilaAuxLlena()){
            System.out.println("-----Produccion detenida:  Capacidad Maxima Alcanzada-----");
        }
        //System.out.println("-----------PILA A---------------");
        //System.out.println("pila desapilada" + pilaA.desapilar().getCodigo());
        //pilaA.mostarPila();
        //System.out.println("-----------PILA B---------------");
        //pilaB.mostarPila();
        //System.out.println("-----------COLA---------------");
        //nue.mostarCola();
        System.out.println();

        Transporte bici = new Transporte(6,"bici");
        boolean b=true;
        while(!bici.llenoTransporte()){
           bici.cargarTransporte(pilaA.desapilar(), pilaB.desapilar());
        }
        bici.muestraCargamento();
        System.out.println();









        System.out.println("Luna Jose Matias Carrera / LAS  / Dni:43.836.664 / ");
        System.out.println("Espinosa Martin Alejandro / LAS-TUP  / Dni:45.549.692 /");
        





    }
}
