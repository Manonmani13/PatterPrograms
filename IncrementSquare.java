package patter;

public class IncrementSquare {
public static void main(String[] args) {
	int k=1;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=7;j++) {
			if(j%2==0)
				System.out.print("*");
			else
				System.out.print(k);
			k++;
		}
		System.out.println();
	}
}
}
