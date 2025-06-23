package EjerTp;

import contenedores.Lista1DLinkedL;
import recursos.NodoDoble;

public class ListaBinarios extends Lista1DLinkedL{
    
    public boolean iguales(Object elementoL, Object elemento) {
        Integer b1 = (Integer)elementoL;
        Integer b2 = (Integer)elemento;
        return b1.intValue()==b2.intValue();
    }
    public void sumaNuevalista(Object A,Object B){
        ListaBinarios c1 = (ListaBinarios)A;
        ListaBinarios c2 = (ListaBinarios)B;
        int cont=0;
        int acarreo=0;
        Integer suma;
        
        if(!c1.estaVacia() && !c2.estaVacia()){
            while(c1.devolver(cont)!=null && c2.devolver(cont)!=null){
                Integer aux1 =(Integer)c1.devolver(cont);
                Integer aux2 =(Integer)c2.devolver(cont); 
                if(iguales(aux1,aux2)){
                    System.out.println("Hola");
                    suma= aux1+aux2;
                    if(suma==0){
                        //si la suma da de los dos es 0 veo nomas que hago con el acarreo
                        if(acarreo==0){
                            insertar(suma, cont);
                        }else{
                            suma=suma+acarreo;
                            insertar(suma, cont);
                            acarreo=0;
                        }
                    }else{
                        //Si la suma no es cero entonces es 1-1 verfico los acarreos
                        if(acarreo==0){
                            suma=0;
                            insertar(suma, cont);
                            acarreo=1;
                        }else{
                            suma=1;
                            insertar(suma, cont);
                            acarreo=1;
                        }
                    }
                }else{
                    // si la los valores de la suma no son iguales ej 1-0 y 0-1 solo veo que hago si hay acarreo
                    if(acarreo==0){
                        suma=1;
                        insertar(suma, cont);
                        acarreo=0;
                    }else{
                        suma=0;
                        insertar(suma, cont);
                        acarreo=0;
                    }
                }
                cont++;
            }
            if(acarreo==1){
                insertar(acarreo, cont);
            }
        }
    }
    public void muestra() {		
		NodoDoble temp;
		
		if (!estaVacia()){
			temp=this.frenteL; // el primero
			while (temp != null) {
								
				System.out.println(temp.getNodoInfo().toString());				
				temp = temp.getNextNodo(); 
			}			
		}else{
			System.out.println("Error muestra. Lista vacia");
		}		
		
	}
}
