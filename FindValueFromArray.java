package patternapp;

import java.util.Scanner;

public class FindValueFromArray {
public static void main(String[] args) {
	int n[]= {4,5,6,3,2,1};
	Scanner sc=new Scanner(System.in);
	int val=sc.nextInt();
	for(int i=0;i<n.length;i++)
	{
		if(val==i)
		{
			System.out.print(n[i]);
		}
	}
}
}
