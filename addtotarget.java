public class addtotarget {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int t = 4;
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
        if(arr[i]+arr[j]==t){
                System.out.println(i + " " + j);
        }
            }
        }
    }
}
