package com.logic.programs;

public class ReversePyramid {
	public static void main(String[] args) {
		for(int i=4;i>=1;i--)
		{
			
			for(int k=1;k<=i;k++)
				System.out.print(k);
			
			System.out.println();
		}
		
	}
}
