package patter;

public class PrintCharacters {
public static void main(String[] args) {
	int l=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++)
		{
			System.out.print((char)(l+64));
			l++;
		}
		System.out.println();
	}
}
}
