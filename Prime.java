package numberpattern;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=prime(sc.nextInt(),2);
	if(n==1)
		System.out.println("prime number");
	else
		System.out.println("not prime number");
}

private static int prime(int nextInt, int i) {
	if(i<nextInt)
	{
		if(nextInt%i==0)
			return prime(nextInt,++i);
		else
			return 0;
	}
	return 1;
}
}
