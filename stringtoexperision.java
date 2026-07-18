public class stringtoexperision {
    public static void main(String[] args) {
        String str = "10+5*2-3/1";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                System.out.println("Operator: " + ch);
            } else {
                System.out.println("Operand: " + ch);
            }
        }
    }  
}
