public class desending {
    public static void main(String[] args) {
        int arr[]={1,4,2,3,9,8,6,10};
        for(int i=0;i<8;i++){
            for(int j=i+1;j<8;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<8;i++){
            System.out.print(arr[i]+" ");
        }
    } 
    
}

