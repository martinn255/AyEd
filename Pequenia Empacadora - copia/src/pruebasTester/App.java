package pruebasTester;
import tipos.Auxiliar;
import tipos.ColaPrincipal;
import tipos.Lata;
//import tipos.OrganizarLatas;

public class App {
    public static void main(String[] args) {
        ColaPrincipal nue = new ColaPrincipal(13);
        nue.generarLatas();
        System.out.println();
        //System.out.println("Elemento Sacado:" + nue.sacaUnaLata().toString());
        
        /*OrganizarLatas org = new OrganizarLatas(5, 5, 2, 2);
        while(!org.pilaLlenaA() && !org.pilaLlenaB() && !nue.colaVacia()){
            org.apilar(nue.sacaUnaLata());
        }
        if(org.pilaLlenaA() || org.pilaLlenaB()){
            System.out.println("-----Produccion detenida:  Capacidad Maxima Alcanzada-----");
        }
        
        System.out.println("-----------PILA A---------------");
        org.mostarPilaA();
        System.out.println("-----------PILA B---------------");
        org.mostarPilaB();
        System.out.println("-----------COLA---------------");
        nue.mostarCola();
        System.out.println();*/
        Auxiliar pilaA = new Auxiliar(5, 2);
        Auxiliar pilaB = new Auxiliar(5, 2);
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
        if(pilaA.pilaAuxLlena() || pilaB.pilaAuxLlena()){
            System.out.println("-----Produccion detenida:  Capacidad Maxima Alcanzada-----");
        }
        System.out.println("-----------PILA A---------------");
        pilaA.mostarPila();
        System.out.println("-----------PILA B---------------");
        pilaB.mostarPila();
        System.out.println("-----------COLA---------------");
        nue.mostarCola();
        System.out.println();
        
    }
}
