public class stringtoexperision {
    public static void main(String[] args) {

        String s = "2*3+4-3";

        int ans = s.charAt(0) - '0';

        for (int i = 1; i < s.length(); i += 2) {
            char op = s.charAt(i);
            int num = s.charAt(i + 1) - '0';

            if (op == '+')
                ans += num;
            else if (op == '-')
                ans -= num;
            else if (op == '*')
                ans *= num;
            else if (op == '/')
                ans /= num;
        }

        System.out.println(ans);
    }
}