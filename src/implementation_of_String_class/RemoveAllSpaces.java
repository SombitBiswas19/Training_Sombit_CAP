package implementation_of_String_class;

public class RemoveAllSpaces {
	public static void main(String[] args) {
		String s = "I LOVE JAVA";
		s = removeallspaces(s);
		System.out.println(s);
		String s1 = "I LOVE JAVA";
		s1=s1.replace(" ",""); //using inbuilt method
		System.out.println(s1);
	}

	private static String removeallspaces(String s) {
        String result = ""; 
        for (int i = 0; i < s.length(); i++) {
           
            if (s.charAt(i) != ' ') {
                result += s.charAt(i);
            }
        }
        return result;
    }
}
