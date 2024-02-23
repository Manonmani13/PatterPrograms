package patternapp;

public class Pattern15 {
public static void main(String[] args) {
	int x,y=0;
	for(int i=5;i>=1;i--) {
		x = i;
		for(int j=1;j<=5;j++) {
			if(j%2==0)
			System.out.print((x+y)+" ");
			else
				System.out.print(x+" ");

			if(j%2==0)
				x = x + 9 ;
			else
				x = x + 1;
			
		}
		y=y+2;
		System.out.println();
	}
}
}
