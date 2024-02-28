package patternapp;

public class Pattern48 {
	public static void main(String[] args) {
		int x=5,y=1,z=0,k=4;
		for(int i=1;i<=5;i++)
		{
			z=y;
			for(int j=1;j<=i;j++) {
				if(i==j)
					System.out.println(i);
				else
				System.out.print(z+" ");
				
				z=z-k-1;			
						

			}
			y=y+x;
			x--;
			k--;
			System.out.println();

		}
	}
}
