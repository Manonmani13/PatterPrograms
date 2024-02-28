package patternapp;

public class Pattern43 {
	public static void main(String[] args) {
		int x=1;

		for(int i=1;i<=5;i++)
		{
			 x=i-1;

			for(int j=1;j<=i;j++) {
				System.out.print(x+i+" ");
				x+=2;
			}
			System.out.println();

		}
	}
}
