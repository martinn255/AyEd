package testing;

public class TestCaracter {
    public static void main(String[] args) {
        ListaDeCaracteres lista = new ListaDeCaracteres();
        lista.insertar(new Character('o'), 0);
        lista.insertar(new Character('h'), 0);
        lista.insertar(new Character('a'), 2);
        lista.insertar(new Character('l'), 2);
        lista.insertar(new Character('*'), 0);
        for(int i=0; i<lista.tamanio();i++){
            Character ch = (Character)lista.devolver(i);
            System.out.println(ch);
        }
    }
}
