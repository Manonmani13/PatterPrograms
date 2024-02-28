package patternapp;

public class Pattern48 {
	public static void main(String[] args) {
		int x=1,y=1,z=0;
		for(int i=5;i>=1;i--)
		{
			y=i;
			z=x;
			for(int j=5;j>=i;j--) {
				
				System.out.print(z+" ");
				z=z-y;
				y++;
			}
			x=x+i;
			System.out.println();

		}
	}
}
