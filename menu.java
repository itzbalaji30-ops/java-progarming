import java.util.*;
class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean flag = true;   
        do{
             System.out.println("enter num:  1.full meal 2.dosa 3.white rice 4.biriyani 5.idly 6.exit");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("full meal");
                break;
            case 2:
                System.out.println("dosa");
                break;
            case 3:
                System.out.println("white rice");
                break;
            case 4:
                System.out.println("biriyani");
                break;
            case 5:
                System.out.println("idly");
                break;
            case 6:
               flag=false;
                break;

            default:
                System.out.println("default");
        }
    }while(flag);
        sc.close();
    }
}