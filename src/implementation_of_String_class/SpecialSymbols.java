package implementation_of_String_class;

public class SpecialSymbols {
    public static void main(String[] args) {
        String s = "Hello@#2024!";
        StringBuffer res = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!( (c >= 'a' && c <= 'z') ||
                   (c >= 'A' && c <= 'Z') ||
                   (c >= '0' && c <= '9') )) {
                res.append(c).append(" ");
            }
        }
        System.out.println(res.toString().trim());
    }
}

