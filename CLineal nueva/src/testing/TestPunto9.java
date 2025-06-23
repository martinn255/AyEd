package testing;
public class TestPunto9 {
    public static void main(String[] args) {
        String cadena1 = "abc(defg(ijk))(1(mn)op)qr";
        String cadena2 = "abc(def))ghij(kl)m";
        BalanceCadena nue = new BalanceCadena(cadena1);
        System.out.println(nue.estaBalanceada());
        System.out.println();
        BalanceCadena nue2 = new BalanceCadena(cadena2);
        System.out.println(nue2.estaBalanceada());

    }
}
