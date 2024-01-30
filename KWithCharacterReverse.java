package patter;

public class KWithCharacterReverse {
	public static void main(String[] args) {
		for(int i=7;i>=1;i--) {
			for(int j=i;j<=7;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
for(int i=2;i<=7;i++) {
	for(int j=i;j<=7;j++) {
		System.out.print(" ");
	}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}
