public class findspecial {
    public static void main(String[] args) {
        String str="a$b#";
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                System.out.println(ch);
            }
        }
    }
}
