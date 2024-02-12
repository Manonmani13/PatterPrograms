package patter;

public class HalfDiamondNo1 {
public static void main(String[] args) {
	int k=3;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++)
		{
			System.out.print(k);
		}
		k++;

		System.out.println();
	}
	k=5;
	for(int j=3;j>=1;j--)
	{
		for(int i=1;i<=j;i++)
		{
			System.out.print(k);
		}
		k--;

		System.out.println();
	}
}
}
