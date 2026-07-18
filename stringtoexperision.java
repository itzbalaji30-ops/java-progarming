import java.util.Stack;


public class stringtoexperision {
    public static void main(String[] args) {

        String s = "10*34+20/2-5";

        Stack<Integer> st = new Stack<>();

        int num = 0;
        char op = '+';

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Build the current number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // Process when an operator or the end of the string is reached
            if (!Character.isDigit(ch) || i == s.length() - 1) {

                switch (op) {
                    case '+':
                        st.push(num);
                        break;

                    case '-':
                        st.push(-num);
                        break;

                    case '*':
                        st.push(st.pop() * num);
                        break;

                    case '/':
                        st.push(st.pop() / num);
                        break;
                }

                op = ch;
                num = 0;
            }
        }

        int ans = 0;

        while (!st.isEmpty()) {
            ans += st.pop();
        }

        System.out.println(ans);
    }
}
