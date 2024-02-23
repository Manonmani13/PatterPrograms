package patternapp;

public class Pattern13 {
	public static void main(String[] args) {
		int x=1;
		for(int i=1;i<=5;i++) {
			x=i;
			for(int j=1;j<=5;j++) {
				System.out.print(x+" ");
				if(j%2==1)
				x=x+9;
				else
					x=x+1;
			}
			System.out.println();
		}
	}
}
