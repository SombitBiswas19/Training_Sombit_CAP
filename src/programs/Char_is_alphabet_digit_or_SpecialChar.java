package programs;

public class Char_is_alphabet_digit_or_SpecialChar {

	public static void main(String[] args) {
		char c='1';
		if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
		{
			System.out.println("Alphabet");
		}
		else if(c>='0'&& c<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}

	}

}
