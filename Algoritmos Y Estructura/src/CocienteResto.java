public class CocienteResto {
    private int a;
    private int b;

    public CocienteResto(){

    }

    public CocienteResto(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int cociente(){
        int a = getA();
        int b = getB();
        if(a>=0 && b>0){
            int c=0;
            while(a>=b){
                c++;
                a=a-b;
            }
            return c;
        }else return (-1);
    }
    public int resto(){
        int a = getA();
        int b = getB();
        if(a>=0 && b>0){
            while(a>=b){
                a=a-b;
            }
            return a;
        }else return (-1);

    }
}
