public class ifzerofullzero {
    public static void main(String[] args){
    
    int arr [][]={{0,1,0},{1,0,1},{1,1,1}};
    for(int row=0;row<3;row++){
        boolean flage = false;
      for(int col=0;col<3;col++){
    if(arr[row][col]==0){
        flage=true;
        break;
    }
    }
    if(flage){
        for(int col2=0;col2<3;col2++){
            arr[row][col2]=0;
        }
    }
    }
    for(int row=0;row<3;row++){
        for(int col=0;col<3;col++){
            System.out.print(arr[row][col]);
        }
        System.out.println();
    }
}
}

