package looping_statements;

public class DivisorsOfNumber {

	public static void main(String[] args) {
		int i=1,count=0;
		while(i<=30)
		{
			if(30%i==0)
			{
				System.out.println(i);
				count+=1;
			}
			i++;
		}
		System.out.println("Count: "+count);

	}

}
