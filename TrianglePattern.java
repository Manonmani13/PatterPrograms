package patter;

public class TrianglePattern {
	public static void main(String[] args) {
		int k=6;
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(k);
			}
			k--;

			System.out.println();
		}
	}
}
