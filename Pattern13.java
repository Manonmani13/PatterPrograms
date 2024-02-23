package patternapp;

public class Pattern13 {
	public static void main(String[] args) {
		int x=1,n=5,y=0;
		for(int i=1;i<=5;i++) {
			x=i;
			y=n-i+1;
			for(int j=1;j<=5;j++) {
				if(j%2==1)
				System.out.print(x+" ");
				else
					System.out.print(y+" ");
				x=x+n;
					y=y+n;
			}
			System.out.println();
		}
	}
}
