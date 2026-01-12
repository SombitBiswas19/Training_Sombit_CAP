package programs;

public class BiggestOfFour {
	public static void main(String[] args) {
		//with conditional and if
		int a=10,b=40,c=30,d=50;
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		if(big>d)
			System.out.println(big);
		else
			System.out.println(d);
		
		//2nd approach using only if
		int a1=10,b1=40,c1=30,d1=50;
		int big1=a1;
		if(big1<b1)
			big1=b1;
		if(big1<c1)
			big1=c1;
		if(big1<d1)
			big1=d1;
		System.out.println(big1);
		
	}
}
