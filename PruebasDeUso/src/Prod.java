public class Prod {
    int a,b;
    int prodDeDos(int a,int b){
            System.out.println(a);
            System.out.println(b);
            if(a!=0){
                if((a%2)!=0 || a==1){
                    return prodDeDos(a/2,b*2) + b;
                }else{
                    return prodDeDos(a/2,b*2);
                }
            }else{
                return a;
            }
        }
}
