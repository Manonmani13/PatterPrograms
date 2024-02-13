package array;

import java.util.Scanner;

public class maxtrixMultiple {
public static void main(String[] args) {
	int n[][]=new int[3][3];
	int k[][]=new int[3][3];
	int m[][]=new int[3][3];

	int l;
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			n[i][j]=sc.nextInt();
			
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			k[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<3.;i++)
	{
		for(int j=0;j<3;j++)
		{
			m[i][j]=n[i][j]*k[i][j];
		}
	}
	for(int i=0;i<3.;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.println(m[i][j]);
		}
	}
}
}
