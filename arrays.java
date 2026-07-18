public class arrays {
    public static void main(String[] args) {
        int arr[]={8,1,2,2,7,1};
        for(int i=0;i<6;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }
        }
        for(int i=0;i<6;i++){
System.out.println(arr[i]);
        }
    }
}
