package implementation_of_String_class;

public class Alphabet_Digit_SpecialChar_count {
	public static void main(String[] args) {
		String s="abc123?.6767%&(_uuig";
		count(s);
	}

	private static void count(String s) {
		int alpha_count=0,digit_count=0,spc_count=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='A'&& s.charAt(i)<='Z'))
			{
				alpha_count++;
			}
			else if((s.charAt(i)>='0'&& s.charAt(i)<='9'))
			{
				digit_count++;
			}
			else {
				spc_count++;
			}
		}
		
		System.out.println("Alphabet Count: "+alpha_count);
		System.out.println("Digit Count: "+digit_count);
		System.out.println("Special Character Count: "+spc_count);
		
	}
}
