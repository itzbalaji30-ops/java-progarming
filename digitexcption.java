import java.util.Scanner;
class Digit extends Exception {
    public Digit(String s) {
        super(s);
    }

}
public class digitexcption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        if (input.length() != 10) {try {
            if(input.length()>10){
                throw new Digit("Number is exceeding 10 digit.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            if(input.length()<10){
                throw new Digit("Number is less than 10 digit.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }else {
        System.out.println("Number is valid." + input); 
    }
}
}
