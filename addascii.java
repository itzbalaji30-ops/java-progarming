public class addascii {
    public static void main(String[] args) {
        int sum=0;
        String c = new String("Abdul");
        for(int i=0;i<c.length();i++){
            sum+=c.charAt(i);
        }
        System.out.println("The sum of ASCII values of " + c + " is: " + sum);
    }
}
