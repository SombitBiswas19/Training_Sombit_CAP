package implementation_of_String_class;

public class CommonChars {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "grape";
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (s2.indexOf(c) != -1 && result.indexOf(c+"") == -1) {
                result.append(c);
                result.append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}

