package patter;

public class DiamondPatter {
public static void main(String[] args) {
	int m=1,n=7;
	for(int i=1;i<=5;i++) {
		for(int k=i;k<=4;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=m;j++)
		{
			System.out.print("*");
		}
		m+=2;
		System.out.println();
	}
	for(int i=4;i>=1;i--) {
		for(int k=i;k<=4;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=n;j++)
		{
			System.out.print("*");
		}
		n-=2;
		System.out.println();
	}
}
}
