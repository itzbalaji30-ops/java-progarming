public class printdigit {
    public static void main(String[] args) {
        String str="ab12cd34";
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
    }
}
