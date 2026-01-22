package implementation_of_String_class;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "(()())";
        int count = 0;
        boolean balanced = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') count++;
            if (str.charAt(i) == ')') count--;

            if (count < 0) {
                balanced = false;
                break;
            }
        }

        if (count != 0) balanced = false;
        System.out.println(balanced ? "Balanced" : "Not Balanced");
    }
}

