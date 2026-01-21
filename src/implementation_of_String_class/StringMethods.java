package implementation_of_String_class;

public class StringMethods {
	
	public static void inbuilt_charAt_method()
	{
		String s="abc";
		//public char charAt(int index)
		char c=s.charAt(0); //take index and return character
		System.out.println(c);
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		//System.out.println(s.charAt(3)); // java.lang.StringIndexOutOfBoundsException
	}
	public static void inbuilt_length_method()
	{
		String s="abc";
		//public int length()
		int l=s.length(); //Returns the length of this string. 
		System.out.println(l);
	}
	public static void inbuilt_uppercase_lowercase_method()
	{
		String s="abcDJK";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}
	
	public static void inbuilt_trim_method()
	{
		String s="  abcDJK";
		//Removes  all leading and trailing space and return the string
		System.out.println(s.trim()); //public String trim()
	}
	
	public static void inbuilt_substring_method()
	{
		String s="hadabhoda";
		//The substring begins with the character at the specified index and
	    // extends to the end of this string.
		System.out.println(s.substring(1)); // public String substring(int beginIndex)
		//The substring begins at the specified {@code beginIndex} and
	    //extends to the character at index {@code endIndex - 1}.
		System.out.println(s.substring(1,4)); //  public String substring(int beginIndex, int endIndex)
	}
	
	public static void inbuilt_toCharArray_method()
	{
		String s="hadabhoda";
		// public char[] toCharArray()
		char [] c=s.toCharArray(); //Converts this string to a new character array.
		for(char i:c)
		{
			System.out.println(i);
		}
	}
	public static void convert_CharArray_to_String()
	{
		//Use constructor;
		char[] c= {'a','c','e'};
		String st=new String(c);
		System.out.println(st);
	}
	
	public static void inbuilt_indexOf_method()
	{
		String s="hadabhoda";
		// public int indexOf(int ch)
		//Returns the index within this string of the first occurrence of the specified character.
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('c')); //if not present returns -1
		//Returns the index within this string of the first occurrence of the
	    //specified character, starting the search at the specified index.
		System.out.println(s.indexOf('a',2)); //public int indexOf(int ch, int fromIndex)
		//Returns the index within this string of the first occurrence of the specified substring.
		System.out.println(s.indexOf("bho")); //public int indexOf(String str)
	}
	
	public static void inbuilt_lastIndexOf_method()
	{
		String s="hadabhoda";
		// public int lastIndexOf(int ch)
		// Returns the index within this string of the last occurrence of the specified character.
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf('c')); //if not present returns -1
		//Returns the index within this string of the last occurrence of
	    //the specified character, searching backward starting at the  specified index.
		System.out.println(s.lastIndexOf('a',2)); //public int lastIndexOf(int ch, int fromIndex)
		//Returns the index within this string of the last occurrence of the
	    //specified substring, searching backward starting at the specified index.
		System.out.println(s.lastIndexOf("oda", 0));//public int lastIndexOf(String str, int fromIndex)
	}
	
	public static void inbuilt_contains_method()
	{
		String s="I love java";
		//public boolean contains(CharSequence s)
		System.out.println(s.contains("love"));
		System.out.println(s.contains("Love"));
		System.out.println(s.contains("Python"));
	}		
	public static void inbuilt_split_method()
	{
		String s="hi,bye,java";
		//public String[] split(String regex)
		String[] str=s.split(",");
		for(String st:str)
		{
			System.out.println(st);
		}
	}		
	public static void inbuilt_equalsIgnoreCase_method()
	{
		//Compares this {@code String} to another {@code String}, ignoring case considerations.
		String s1="java";
		String s2="JAVA";
		//public boolean equalsIgnoreCase(String anotherString)
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		//Compares this string to the specified object.
		System.out.println(s1.equals(s2)); //false
	}		
	public static void inbuilt_startsWith_method()
	{
		//Compares this {@code String} to another {@code String}, ignoring case considerations.
		String s1="helloworld";
		//public boolean startsWith(String prefix)
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.startsWith("world"));
	}		
	public static void inbuilt_endsWith_method()
	{
		//Tests if this string ends with the specified suffix.
		String s1="helloworld";
		//public boolean endsWith(String suffix)
		System.out.println(s1.endsWith("world")); //true
		System.out.println(s1.endsWith("wor")); //false
		System.out.println(s1.endsWith("rld")); //true
	}		
	public static void inbuilt_valueOf_method()
	{
		int a=100;
		String s=null;
		//public static String valueOf(int i)
		s=s.valueOf(a); //Returns the string representation of the {@code int} argument.
		System.out.println(s);
	}		
	public static void inbuilt_isBlank_and_isEmpty_method()
	{
		String s=" ";
		//Returns true if the string is empty or contains only Whitespace
		System.out.println(s.isBlank()); //public boolean isBlank()
		//Returns true if, and only if, length is 0.
		System.out.println(s.isEmpty()); //public boolean isEmpty()
	}
	public static void inbuilt_replace_method()
	{
		String s1="hello hi hi students";
		/*Replaces each substring of this string that matches the literal target
	      sequence with the specified literal replacement sequence.*/
		////public String replace(CharSequence target, CharSequence replacement)
		System.out.println(s1.replace("hi", "bye"));
		System.out.println(s1.replaceFirst("hi", "bye"));
	}	
	public static void inbuilt_strip_method()
	{
		String s1="  hello hi hi students  ";
		//Returns a string whose value is this string, with all leading white space removed.
		System.out.println(s1.stripLeading());
		//Returns a string whose value is this string, with all trailing white space removed.
		System.out.println(s1.stripTrailing());
	}	
	
	public static int no_of_alphabets(String s)
	{
		int l=s.length(),count=0; 
		for(int i=0;i<l;i++) {
			if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='A'&& s.charAt(i)<='Z'))
			{
				count++;
			}
		}
		return count;
	}
	
	public static String lowercase(String s)
	{
		int l=s.length(); 
		String s1 ="";
		for(int i=0;i<l;i++) {
			char c=s.charAt(i);
			if((c>='A'&& c<='Z'))
			{
				c+=32;
				s1+=c;
			}
			else {
				s1+=c;
			}
		}
		return s1;
	}
	
	public static String uppercase(String s)
	{
		int l=s.length(); 
		String s1 ="";
		for(int i=0;i<l;i++) {
			char c=s.charAt(i);
			if((c>='a'&& c<='z'))
			{
				c-=32;
				s1+=c;
			}
			else {
				s1+=c;
			}
		}
		return s1;
	}
	
	public static void ExampleofImmutable()
	{
		String a="honu";
		a.toUpperCase();
		System.out.println(a);
		System.out.println(a.hashCode());
		a=a.toUpperCase();
		System.out.println(a);
		System.out.println(a.hashCode());
	}
	public static void main(String[] args) {
		String s1=new String("xyz"); //creates object in heap area
		String s2="abc"; //creates object in String Constant Pool
		String s3="xyz"; //creates object in String Constant Pool
		String s4=new String("xyz"); //creates object in heap area
		String s5=new String("abc"); //creates object in heap area
		String s6="abc"; //creates object in String Constant Pool
		//Here address of both is different but content is same.
		System.out.println(s1.equals(s3)); //compares the content  //true
		System.out.println(s1==s3); //compares the address  //false
		
		System.out.println(s4.equals(s5)); //compares the content  //false
		System.out.println(s4==s5); //compares the address  //false
		
		System.out.println(s1.equals(s4)); //compares the content  //true
		System.out.println(s1==s4); //compares the address  //false
		
		System.out.println(s2.equals(s6)); //compares the content  //true
		System.out.println(s2==s6); //compares the address  //true
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		ExampleofImmutable();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt charAt method: ");
		inbuilt_charAt_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt length method: ");
		inbuilt_length_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		int count=no_of_alphabets("abcd547392jdgfhfms");
		System.out.println("Count of Alpahbets "+count);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt lowercase and uppercase method: ");
		inbuilt_uppercase_lowercase_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Using user-defined lowercase");
		String sl=lowercase("ABC123");
		System.out.println(sl);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Using user-defined uppercase");
		String su=uppercase("ABCdz123");
		System.out.println(su);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt trim method");
		inbuilt_trim_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt substring method");
		inbuilt_substring_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt toCharArray method");
		inbuilt_toCharArray_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Convert CharArray to String-> done by Constructor itself");
		convert_CharArray_to_String();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt indexOf method");
		inbuilt_indexOf_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt lastIndexOf method");
		inbuilt_lastIndexOf_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt contains method");
		inbuilt_contains_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt split method");
		inbuilt_split_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt equalsIgnoreCase method");
		inbuilt_equalsIgnoreCase_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt startsWith method");
		inbuilt_startsWith_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt endsWith method");
		inbuilt_endsWith_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt valueOf method");
		inbuilt_valueOf_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt isBlank and isEmpty method");
		inbuilt_isBlank_and_isEmpty_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt replace method");
		inbuilt_replace_method();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Inbuilt strip method");
		inbuilt_strip_method();
	}
}
