package implementation_of_Arrays;

public class Pangrams {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("The quick brown fox jumps over the lazy dog");
	    //A pangram is a sentence that contains every letter of the alphabet at least once.
		boolean ans=pangrams(s);
		if(ans)
		{
			System.out.println("Pangrams");
		}
		else {
			System.out.println("Not Pangrams");
		}
	}

	private static boolean pangrams(StringBuffer s) {
		int count=0;
		boolean[] freq_alpha=new boolean[26];
		for(char ch:s.toString().toCharArray())
		{
			if (ch >= 'a' && ch <= 'z') {
	            int index = ch - 'a';
	            if (!freq_alpha[index]) {
	            	freq_alpha[index] = true;
	                count++;
	            }
	        }
		}
		return count==26;
	}

}
