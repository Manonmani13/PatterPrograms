package numberpattern;

public class TriangleSimple {
	public static void main(String[] args) {
		int m=1;
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=m;j++) {
				if(j%2==0)
					System.out.print(" ");
				else if(j==1|m==9||j==6)
					System.out.print(i);
			}
			m+=2;
			System.out.println();
		}
	}
}
