public class Principal {
    public static void main(String[] args){
        Primo p = new Primo(30031);
        System.out.println("Es Primo: " + p.esPrimo());
        //System.out.println("El Primo mas cerca es : " + p.encuentraPrimo());
        CocienteResto pa = new CocienteResto(30,21); 
        System.out.println("Cociente: " + pa.cociente());
        System.out.println("Resto : " + pa.resto());
    }
}
