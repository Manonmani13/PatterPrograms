package com.logic.programs;

public class HollowTriangleReverse {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				if(i+j==6||j==5||i==5)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
