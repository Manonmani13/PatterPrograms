package com.logic.programs;

public class RightCross {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int k=1;k<i;k++) {
			System.out.print("   ");

		}
		for(int j=i;j<=4;j++) {
				System.out.print(" * ");
		}
		System.out.println();
	}

}
}
