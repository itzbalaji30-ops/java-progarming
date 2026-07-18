public class frequency {
    public static void main(String[] args) {
        int arr[]={8,2,2,3,1,5};
        int count=0;
        int t=2;
        for(int i=0;i<6;i++){
            if(arr[i]==t){
                count++;
            }
        }
        System.out.println(count);
    }
}
