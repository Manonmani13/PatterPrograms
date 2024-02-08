package numberpattern;

public class NumberTraingleDiffernt {
public static void main(String[] args) {
	int m=1,n=9;
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=4;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=m;j++) {
			System.out.print(j);
		}m+=2;
		System.out.println();
	}
	for(int i=5;i>=1;i--) {
		for(int j=i;j<=4;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=n;j++) {
			System.out.print(j);
		}n-=2;
		System.out.println();
	}
	
}
}
