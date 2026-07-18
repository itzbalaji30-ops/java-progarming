
  public class pattern3 {
  public static void main(String[] args) {
    int n=10;
    int i;
    int j;
    int count=1;
    for(i=0;i<n;i++){
        for(j=0;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println(" " );
    }
}
  }