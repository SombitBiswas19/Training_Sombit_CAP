package implementation_of_Arrays;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Sombit Biswas hehe");
		StringBuffer s2=new StringBuffer("Biswass hehe Sombit");
		//In Java, two strings are considered anagrams if they contain 
		//the same characters with the exact same frequencies, but arranged in a different order. 
		int[] freq1=FrequencyOfCharactersInString.frequencyofchars(s1);
		int[] freq2=FrequencyOfCharactersInString.frequencyofchars(s2);
		
		if(Arrays.equals(freq1, freq2))
		{
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
		

	}

}
