package conditional_statement;

public class Convert_CapitalToSmall_alphabet {

	public static void main(String[] args) {
		//A=65,a=97, difference->32
		char c='R';
		if(c>='a'&& c<='z')
		{
			int ans=c-32;
			char out=(char)ans;
			System.out.println(out);
		}
		else if(c>='A'&& c<='Z')
		{
			int ans=c+32;
			char out=(char)ans;
			System.out.println(out);
		}

	}

}
