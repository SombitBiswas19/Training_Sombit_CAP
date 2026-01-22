package implementation_of_String_class;

public class Isogram {
    public static void main(String[] args) {
        String str = "Machine".toLowerCase();
        boolean isIsogram = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                isIsogram = false;
                break;
            }
        }
        System.out.println(isIsogram ? "Isogram" : "Not Isogram");
    }
}

