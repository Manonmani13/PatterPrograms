package patternapp;

public class Pattern7 {
public static void main(String[] args) {
	int m=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(m+" ");
			m+=2;
		}
		System.out.println();
	}
}
}
