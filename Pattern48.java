package patternapp;

public class Pattern48 {
	public static void main(String[] args) {
		int x=5,y=1;
		for(int i=1;i<=5;i++)
		{
		
			for(int j=1;j<=i;j++) {
				if(i==j)
					System.out.println(i);
				else
				System.out.print(y+" ");
				
			}
			y=y+x;
			x--;
			
			System.out.println();

		}
	}
}
