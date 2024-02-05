package patter;

public class DiamondAlphabet {
public static void main(String[] args) {
	int l=1;
	for(int i=1;i<=7;i++) {
		for(int j=i;j<=7;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print((char) (l+64));
		l++;
		}
		System.out.println();
	}
	for(int i=6;i>=1;i--) {
		for(int j=i;j<=7;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print((char) (l+64));
			l++;
			}
		System.out.println();
	}
}
}
