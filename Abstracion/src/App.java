public class App {
    public static void main(String[] args)  {
        Complejos n1 = new Complejos(8, 10);
        Complejos n2 = new Complejos(2,5);
        Complejos n3 = new Complejos();
        n3.sumar(n1, n2);
        System.out.println(n3);
        n3.restar(n1, n2);
        System.out.println(n3);
        n3.multiplicar(n1, n2);
        System.out.println(n3);
        System.out.println(n1.sonIguales(n2));  

    }
}
