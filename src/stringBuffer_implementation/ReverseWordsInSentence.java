package stringBuffer_implementation;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("I am student");
		String[] words = s1.toString().split(" ");
		StringBuffer s2 = new StringBuffer();
		for (int i = words.length - 1; i >= 0; i--) {
			s2.append(words[i]);
			if (i != 0) {
				s2.append(" ");
			}
		}

		System.out.println("Original: " + s1);
		System.out.println("Reversed: " + s2);

	}

}
