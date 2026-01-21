package implementation_of_String_class;

public class LastWordLowercase {
	public static void main(String[] args) {
		String s = "I LOVE JAVA";
		s = lastwordlower(s);
		System.out.println(s);
	}

	private static String lastwordlower(String s) {
		String s1 = "";
		for (int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			if (s.charAt(i + 1) == ' ' && (c >= 'A' && c <= 'Z')) {
				s1 += (char) (c + 32);
			} else {
				s1 += c;
			}
		}
		char c1 = s.charAt(s.length() - 1);
		s1 += (char) (c1 + 32);
		return s1;
	}

}
