package patter;

import java.util.Scanner;

public class ExtractDigit {
public static void main(String[] args) {
	int n,m = 0,a,i=1,counter=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	n=sc.nextInt();
	m=n;
	while(n>0)
	{
		n=n/10;
		counter++;
	}
	while(m>0)
	{
		a=m%10;
		System.out.println("Digit at Position "+counter+" "+a);
		m=m/10;
		counter--;
	}
}
}
