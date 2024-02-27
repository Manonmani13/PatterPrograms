package patternapp;

public class Pattern31 {
public static void main(String[] args) {
	int x;
	for(int i=1;i<=5;i++)
	{
		x=i;
		for(int j=1;j<=5;j++) {
			System.out.print((char)(x+64)+" ");
			x++;
		}
		System.out.println();

	}
}
}
