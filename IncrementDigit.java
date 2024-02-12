package patter;

public class IncrementDigit {
public static void main(String[] args) {
	int n=3453,s=0,a=0;
	while(n>0)
	{
		s=(n%10)+1;
		a=a*10+s;	
		n=n/10;
	}
	System.out.println(" result "+a);
}
}
