package patter;

public class DiamondT2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
