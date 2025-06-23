public class Primo {
    private long a;
    public Primo(){

    }

    public Primo(long a) {
        this.a = a;
    }
    
    public long getA() {
        return a;
    }
    public boolean esPrimo(){
        long a = getA();
        long av = Math.abs(a);
        if(av <= 1){
            return false;
        }else{
            if((av%2)==0){
                if(av==2){
                    return true;
                }else return false;
            }else{
                boolean band = true;
                long d = 3;
                while((d*d)<=av && band==true){
                    if((av % d)==0){
                        band = false;
                    }else {
                        d=d + 2;
                    }
                }
                return band;
            }
        }
    }
    public long encuentraPrimo(){
        boolean band = false;
        long a = getA();
        while(band == false){
            if((a%2)==0){
                a++;
            }else{
                a=a+2;
            }
            //band = esPrimo(a);
        }
        return a;
    }
   
        
}
