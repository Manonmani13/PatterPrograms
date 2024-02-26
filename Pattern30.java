package patternapp;

public class Pattern30 {
public static void main(String[] args) {
	int k=1;
	for(int i=5;i>=1;i--) {
		for(int j=5;j>=1;j--)
		{
			System.out.print((char)(k+64));
			k++;

		}
		System.out.println();
	}
}
}
