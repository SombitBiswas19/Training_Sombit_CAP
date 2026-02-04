package testing;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		ValidParenthesis parenthesis=new ValidParenthesis();
		
		String string1="{{()}}";
		String string2="{{(}}";
		String string3="{{[{]()))(}}";
		
		System.out.println(parenthesis.validParenthesis(string1));
		System.out.println(parenthesis.validParenthesis(string2));
		System.out.println(parenthesis.validParenthesis(string3));
		
	}
	public boolean validParenthesis(String str)
	{
		Stack<Character> st=new Stack<>();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='('||ch[i]=='{'||ch[i]=='[')
			{
				st.push(ch[i]);
			}
			else if(ch[i]==')'||ch[i]=='}'||ch[i]==']')
			{
				if (st.isEmpty()) { 
                    return false;
                }
                char top = st.pop();
                if((ch[i]==')' && top!='(')||(ch[i]=='}' && top!='{')||(ch[i]==']' && top!='['))
                {
                	return false;
                }
			}
		}
		return st.isEmpty();
	}

}
