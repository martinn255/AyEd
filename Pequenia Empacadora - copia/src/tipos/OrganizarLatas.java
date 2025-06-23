package tipos;
import contenedores.*;
public class OrganizarLatas {
    private PilaArr pilaA;
    private PilaArr pilaB;
    private PilaArr pilaAuxA;
    private PilaArr pilaAuxB;
    public OrganizarLatas(int tamA,int tamB,int auxA,int auxB){
        this.pilaA= new PilaArr(tamA);
        this.pilaB= new PilaArr(tamB);
        this.pilaAuxA= new PilaArr(auxA);
        this.pilaAuxB= new PilaArr(auxB);
    }
    public void apilar(Object obj){
        Lata aux =(Lata)obj;
            if(aux.getTipoDeAtun().equals("aceite")){
                if(!this.pilaA.estaLlena()){
                    this.pilaA.meter(aux);
                    System.out.println("Lata LAT-0" + aux.getCodigo() + " apilada en Pila A");
                } else{
                    System.out.println("Pila llena! Usando PilaAuxA para LAT-0" + aux.getCodigo());
                    this.pilaAuxA.meter(aux);
                }
            }else{
                if(!this.pilaB.estaLlena()){
                    this.pilaB.meter(aux);
                    System.out.println("Lata LAT-0" + aux.getCodigo() + " apilada en Pila B");
                }else{
                    System.out.println("Pila llena! Usando PilaAuxB para LAT-0" + aux.getCodigo());
                    this.pilaAuxB.meter(aux); 
                }
            }
        
    }
    public boolean pilaLlenaA(){
        return this.pilaAuxA.estaLlena();
    }
    public boolean pilaLlenaB(){
        return this.pilaAuxB.estaLlena();
    }
    public void mostarPilaA(){
        int cont=0;
        String cadena="";
        while(!this.pilaA.estaVacia()){
            Lata aux = (Lata)this.pilaA.sacar();
            cadena += "LAT-0" + aux.getCodigo()  + " , ";
            cont++;
            //System.out.println("En Pila A: " + aux.toString());
        }
        System.out.println("Pila A contiene " + cont + " Latas " + cadena);
        cont=0;
        String cadena1="";
        if(!this.pilaAuxA.estaVacia()){
            while(!this.pilaAuxA.estaVacia()){
                Lata aux1 = (Lata)this.pilaAuxA.sacar();
                cadena1 += "LAT-0" + aux1.getCodigo()  + " , ";
                cont++;
                //System.out.println("En Pila auxA: " + aux1.toString());
            }
            System.out.println("Pila aux A contiene " + cont + " Latas " + cadena1);
        }else{
            System.out.println("No se uso aux");
        }
    }
    public void mostarPilaB(){
        int cont=0;
        String cadena="";
        while(!this.pilaB.estaVacia()){
            Lata aux = (Lata)this.pilaB.sacar();
            cadena += "LAT-0" + aux.getCodigo()  + " , ";
            cont++;
            //System.out.println("En Pila B: " + aux.toString());
        }
        System.out.println("Pila B contiene " + cont + " Latas " + cadena);
        cont=0;
        String cadena1="";
        if(!this.pilaAuxB.estaVacia()){
            while(!this.pilaAuxB.estaVacia()){
                Lata aux1 = (Lata)this.pilaAuxB.sacar();
                cadena1 += "LAT-0" + aux1.getCodigo()  + " , ";
                cont++;
                //System.out.println("En Pila auxB: " + aux1.toString());
            }
             System.out.println("Pila aux B contiene " + cont + " Latas " + cadena1);
        }else{
                System.out.println("No se uso aux");
            }
    }
}
