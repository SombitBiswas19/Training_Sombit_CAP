package implementation_of_String_class;

public class Swap_lastChar_And_firstChar {
    public static void main(String[] args) {
        String s = "ILOVEJAVA";
        s = swapping(s);
        System.out.println(s);
    }

    private static String swapping(String s) {
       
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        String middle = s.substring(1, s.length() - 1);

        
        return lastChar + middle + firstChar;
    }
}
