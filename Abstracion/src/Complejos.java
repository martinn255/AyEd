public class Complejos implements IOperaciones {
    private double real;
    private double imaginario;
    public Complejos(double real,double imaginario){
        this.real = real;
        this.imaginario= imaginario;
    }
    public Complejos(){
        this(0,0);
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginario(){
        return this.imaginario;
    }
    public void sumar(Object A,Object B){
        Complejos c1 = (Complejos)A;
        Complejos c2 = (Complejos)B;
        this.real= c1.getReal() + c2.getReal();
        this.imaginario= c1.getImaginario() + c2.getImaginario();
    }
    public void restar(Object A,Object B){
        Complejos c1 = (Complejos)A;
        Complejos c2 = (Complejos)B;
        this.real= c1.getReal() - c2.getReal();
        this.imaginario= c1.getImaginario() - c2.getImaginario();
    }
    public void multiplicar(Object A,Object B){
        Complejos c1 = (Complejos)A;
        Complejos c2 = (Complejos)B;
        this.real= (c1.getReal() * c2.getReal()) + (c1.getImaginario()* c2.getImaginario() * (-1));
        this.imaginario= (c1.getReal()*c2.getImaginario()) + (c1.getImaginario()* c2.getReal());
    }
    public void potencia(Object A,int exponente){
        Complejos c1 = (Complejos)A;

    }
    public void dividir(Object A,Object B){
        Complejos c1= (Complejos)A;
        Complejos c2= (Complejos)B;
        this.real= (c1.getReal()* c2.getReal()) + (c1.getImaginario()*c2.getImaginario())/((c2.getReal()*c2.getReal())+(c2.getImaginario()* c2.getImaginario())) ;
        this.imaginario=(c1.getImaginario()* c2.getReal()) - (c1.getReal()*c2.getImaginario())/((c2.getReal()*c2.getReal())+(c2.getImaginario()* c2.getImaginario())) ;
    }
    public boolean sonIguales(Object otro){
        Complejos c1 = (Complejos)otro;
        return getReal()== c1.getReal() && getImaginario()== c1.getImaginario();
    }
    public String toString(){
        return getReal() + " + " + getImaginario() + " i";
    }
}
