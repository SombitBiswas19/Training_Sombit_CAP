package implementation_of_Arrays;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("sombit biswas");
		int[] freq=frequencyofchars(s);
		
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println((char) (i + 'a') + ": " + freq[i]);
			}
		}
	}

	public static int [] frequencyofchars(StringBuffer s) {
		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				int index = c - 'a';
				freq[index]++;
			}
		}
		return freq;

	}

}
