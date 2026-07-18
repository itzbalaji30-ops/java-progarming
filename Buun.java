import java.util.Scanner;  

public class Buun {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
            int x = sc.nextInt();
           if(x%7 == 1){
               System.out.println("Sunday");
              }else if(x%7 == 2){
                  System.out.println("Monday");
                }else if(x%7 == 3){
                    System.out.println("Tuesday");
                  }else if(x%7 == 4){
                      System.out.println("Wednesday");
                    }else if(x%7 == 5){
                        System.out.println("Thursday");
                      }else if(x%7 == 6){
                          System.out.println("Friday");
                        }else if(x%7 == 0){
                            System.out.println("Saturday");
                          }else{
                              System.out.println("Invalid input");
                            }
         sc.close();
    }
}
