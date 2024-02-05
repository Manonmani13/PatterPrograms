package patter;

public class CharacterRight {
	public static void main(String[] args) {
		int l=1;
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(l+64));
				l++;
			}
			System.out.println();
		}
	}
}
