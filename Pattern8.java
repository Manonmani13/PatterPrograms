package patternapp;

public class Pattern8 {
public static void main(String[] args) {
	int m=2;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(m+" ");
			m+=2;
		}
		System.out.println();
	}
}
}
