package patternapp;

public class Pattern33 {
	public static void main(String[] args) {
		int x;
		for(int i=5;i>=1;i--)
		{
			x=i;
			for(int j=5;j>=1;j--) {
				System.out.print((char)(x+64)+" ");
				x+=5;
			}
			System.out.println();

		}
	}
}
