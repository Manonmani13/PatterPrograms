package patter;

public class LeftHalfDiamondUsingCharacter {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}
