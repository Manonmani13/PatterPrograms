package patter;

public class Triangle {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=4;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(j==1 ||i==5||i==j)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
