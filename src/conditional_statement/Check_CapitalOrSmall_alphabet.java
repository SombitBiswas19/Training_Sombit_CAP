package conditional_statement;

public class Check_CapitalOrSmall_alphabet {

	public static void main(String[] args) {
		char c='a';
		if(c>='a'&& c<='z')
		{
			System.out.println("Small Alphabet");
		}
		else if(c>='A'&& c<='Z')
		{
			System.out.println("Capital Alphabet");
		}
		
	}

}
