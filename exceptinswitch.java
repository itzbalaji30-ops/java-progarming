import java.util.*;

class Myexception extends Exception {
    public Myexception(String s) {
        super(s);
    }
}
class exceptinswitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Full Meal");
            System.out.println("2. Dosa");
            System.out.println("3. White Rice");
            System.out.println("4. Biriyani");
            System.out.println("5. Idly");
            System.out.println("6. Exit");

            int a = sc.nextInt();

            try {

                 if (a < 1 || a > 6) {
                    throw new Exception("Food is not available in the menu.");
                }

                switch (a) {
                    case 1:
                        System.out.println("Full Meal");
                        break;

                    case 2:
                        System.out.println("Dosa");
                        break;

                    case 3:
                        System.out.println("White Rice");
                        break;

                    case 4:
                        System.out.println("Biriyani");
                        break;

                    case 5:
                        System.out.println("Idly");
                        break;

                    case 6:
                        System.out.println("Thank You!");
                        flag = false;
                        break;

                    /*case 7:
                        try {
                            throw new Myexception("Food is not available in the menu.");
                        } catch (Myexception e) {
                            System.out.println(e.getMessage());
                        }*/
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (flag);

        sc.close();
    }
}