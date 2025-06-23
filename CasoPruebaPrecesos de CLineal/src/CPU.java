import contenedores.*;
public class CPU {
    private ColaSLinkedList cola;
    private int tiempo;
    public CPU(int tiempo){
        this.tiempo= tiempo;
        this.cola = new ColaSLinkedList();
    }
    public void cargar(int n){
        for(int i=0;i<n;i++){
            this.cola.meter(new Proceso());
        }
    }
    public void atender(){
        while(!this.cola.estaVacia()){
            Proceso aux = (Proceso)this.cola.sacar();
            aux.incCantAtenciones();
            if(aux.getTiempo()>this.tiempo){
                aux.setTiempo(aux.getTiempo()-this.tiempo);
                this.cola.meter(aux);
            }else {
                System.out.println("Proceso atendido: " +  aux.getId() 
                + " Atendido: " + aux.getCantAtenciones() + " Veces, tiempo osioso: " + (this.tiempo- aux.getTiempo()));
            }
        }
    }
}
