package patternapp;

public class Pattern45 {
	public static void main(String[] args) {
		int x=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++) {
				System.out.print(x+" ");
				x+=2;
			}
			
			System.out.println();

		}
	}
}
