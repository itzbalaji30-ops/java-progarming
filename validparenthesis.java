public class validparenthesis {
    public static void main(String[] args) {
        String s = "({[]})";
        int countp=0;
        int countq=0;
        int countr=0; 
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                countp++;
            }
            else if(ch==')'){
                countp--;
            }
            else if(ch=='{'){
                countq++;
            }
            else if(ch=='}'){
                countq--;
            }
            else if(ch=='['){
                countr++;
            }
            else if(ch==']'){
                countr--;
            }
        }
        if(countp==0 && countq==0 && countr==0){
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Invalid Parenthesis");
        }
    }
}
