package implementation_of_String_class;

public class FirstCharOfWord_Uppercase {

	public static void main(String[] args) {
		String s="abc123 uuig Ugtsk guygxbSSB";
		s=firstchar_upper(s);
		System.out.println(s);
	}

	private static String firstchar_upper(String s) {
		String s1="";
		char c1=s.charAt(0);
		s1+=c1;
		s1=s1.toUpperCase();
		for(int i=0;i<s.length()-1;i++)
		{
			char c=s.charAt(i+1);
			if(s.charAt(i)==' '&& c!=' ')
			{
				if(c>='a'&& c<='z')
				{
					c-=32;
				}
			}
			s1+=c;
			
		}
		return s1;
	}

}
