package patter;

public class IncrementDigit {
public static void main(String[] args) {
	int n=4567,s=0,a=0;
	StringBuffer string=new StringBuffer();
	while(n>0)
	{
		s=(n%10)+1;
		a=a*10+s;	
		n=n/10;
	}

	string.append(String.valueOf(a)).reverse();
	System.out.println(" result "+string);
}
}
