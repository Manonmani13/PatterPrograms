package patternapp;

public class Pattern57 {
public static void main(String[] args) {
	int n1=1,n2=0,n3=n1+n2;
	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++) {
			System.out.print(n3+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}
}
}
