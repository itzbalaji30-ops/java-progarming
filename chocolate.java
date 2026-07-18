import java.util.*;
public class chocolate {
    public static void main(String[] args) {
        int arr[]={6,7,8,9,2,3};
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<6;i++){
            if(arr[i]%t==1){
                System.out.println(i);
                break;
            }
    System.out.println("u dont have any chocolate ");
    }
    sc.close();
}
}
