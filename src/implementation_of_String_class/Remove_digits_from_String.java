package implementation_of_String_class;

public class Remove_digits_from_String {
    public static void main(String[] args) {
        String s = "abc123uuig";
        s = removedigits(s);
        System.out.println(s);
    }

    private static String removedigits(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                s1 = s1 + c;
            }
        }
        return s1;
    }
}
