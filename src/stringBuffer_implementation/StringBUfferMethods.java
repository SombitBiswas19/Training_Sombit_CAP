package stringBuffer_implementation;

public class StringBUfferMethods {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("xyz");
		StringBuffer s2=new StringBuffer("xyz");
		
		System.out.println(s1); //only toString() is overridden here
		System.out.println(s1.equals(s2)); //address comparison
		System.out.println(s1==s2); //address comparison
		
		String s=new String(s1); //Convert StringBuffer to String
		
		StringBuffer s3=new StringBuffer(s);// convert String -> SB 
		
		System.out.println(s1.reverse()); //possible bcz immutable
		
		s1.append(" java");
		
		System.out.println(s1);
		
		StringBuffer s4=new StringBuffer(" ssaa  sdv wdf  c  ");
		System.out.println(s4.capacity()); //35
		s4.trimToSize();
		System.out.println(s4.capacity()); //19
		
		s4.insert(0, "hamba");
		System.out.println(s4);
		s4.delete(0, 2);
		System.out.println(s4);
		
		s4.replace(0, 2, "hii");
		System.out.println(s4);
	}
}
