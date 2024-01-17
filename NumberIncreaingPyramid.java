package com.logic.programs;

public class NumberIncreaingPyramid {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			
			for(int k=1;k<=i;k++)
				System.out.print(k);
			for(int j=i;j<=3;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
