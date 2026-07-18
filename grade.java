import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = Character.toUpperCase(sc.next().charAt(0));
        switch (grade) {
            case 'A':
                
            case 'B':
                
            case 'C':
                System.out.println("You have passed");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
        sc.close();
    }
}
