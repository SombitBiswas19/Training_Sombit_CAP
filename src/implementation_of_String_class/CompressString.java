package implementation_of_String_class;

public class CompressString {
    public static void main(String[] args) {
        String s = "aaabbccc";
        StringBuffer result = new StringBuffer();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        System.out.println(result);
    }
}

