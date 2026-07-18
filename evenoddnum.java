
public class evenoddnum {
    public static void main(String[] args) {
    int n = 7151214;
    
    while (n>0) {
        int d=n%10;
        if(d%5==0){
            System.out.print(d);
        }
       
    n=n/10;
    }

    }
    
}
