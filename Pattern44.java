package patternapp;

public class Pattern44 {
public static void main(String[] args) {
	int x=1,y=1;
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++) {
			System.out.print(x+" ");
			x--;
		}
		y+=2+i;
		x=y;
		System.out.println();

	}
}
}
