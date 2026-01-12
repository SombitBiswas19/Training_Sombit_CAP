package looping_statements;

public class Print_Odd_numbers_inRange {
public static void main(String[] args) {
	int n1=15,n2=30;
	while(n1<=n2)
	{
		if(n1%2!=0)
		{
			System.out.println(n1);
		}
		n1++;
	}
}
}
