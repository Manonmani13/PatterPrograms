package patter;

public class LeftInclinedRhombus {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=4;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			if(i%2==0)
				System.out.print("-");
			else
				System.out.print("*");
		}	System.out.println();
	}
	for(int i=4;i>=1;i--) {
		for(int j=i;j<=4;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			if(i%2==0)
				System.out.print("*");
			else
				System.out.print("-");
		}	System.out.println();
	}
}
}
