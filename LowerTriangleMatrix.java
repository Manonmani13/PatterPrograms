package array;

import java.util.Scanner;

public class LowerTriangleMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int s[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			s[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i<=j)
			System.out.print(s[i][j]);
			else
				System.out.print("0");
		}
		System.out.println();
	}
}
}
