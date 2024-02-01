package patter;

public class ChirstMasTrees1 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=9;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	for(int i=3;i<=7;i++) {
		for(int j=i;j<=9;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	for(int i=5;i<=9;i++) {
		for(int j=i;j<=9;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	for(int i=1;i<=4;i++) {
		for(int j=i;j<=6;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=4;j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}
