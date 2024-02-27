package patternapp;

public class Pattern40 {
	public static void main(String[] args) {
		int x=0;
		for(int i=5;i>=1;i--)
		{
		x=2;
			for(int j=5;j>=i;j--) {
				System.out.print(x);
				x+=2;

			}

			System.out.println();

		}
	}
}
