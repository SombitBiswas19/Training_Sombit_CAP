package testing;

public class Controller {

	public static void main(String[] args) {
		Stack_Creation_Manually stack=new Stack_Creation_Manually(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		
		String rev=string_rev("abcd");
		System.out.println(rev);
	}
	
	public static String string_rev(String str)
	{
		String ans="";
		for(int i=0;i<str.length();i++) 
		{
			ans=str.charAt(i)+ans; //1+2+3+...=n(n+1)/2; ->O(n^2) (T.C)... 
			//S.C->O(n) because previous variable gets destroyed by garbage collector.
		}
		return ans;
		
	}

}
