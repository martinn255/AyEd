package tipos;

import contenedores.PilaArr;
//import contenedores.PilaSLinkedList;

public class Transporte  {
    //private String tipoDeTransporte;
    private PilaArr almacena;
    
    public Transporte(int tamPila,String tipoDeTransporte){
        //super(tamPila);
        this.almacena = new PilaArr(tamPila);
        //this.tipoDeTransporte = tipoDeTransporte;
    }
    public void cargarTransporte(Object a ,Object b){
        if(!llenoTransporte()){
            this.almacena.meter(a);
            this.almacena.meter(b);
        }else{
            System.out.println("Se lleno Transporte");
        }
    }
    public void muestraCargamento(){
        PilaArr aux = this.almacena;
        if(!aux.estaVacia()){
            System.out.println("ssss");
            
            while (!aux.estaVacia()) {
                Lata vvv = (Lata)aux.sacar();
                System.out.print("Tipo: " + vvv.getCodigo() + "\t");
            }
        }else{
            System.out.println("ssd");
        }
        
    }
    public boolean llenoTransporte(){
        return this.almacena.estaLlena();
    }




}
