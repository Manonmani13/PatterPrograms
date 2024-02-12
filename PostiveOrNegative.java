package patter;

import java.util.Scanner;

public class PostiveOrNegative {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n>0)
		System.out.println("The Given Number is positive");
	else if(n<0)
		System.out.println("The given  Number is negative");
}
}
