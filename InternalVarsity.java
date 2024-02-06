package patter;

public class InternalVarsity {
public static void main(String[] args) {
	int k=1;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=3;j++) {
			if(i!=1 && j%2==0) {
					System.out.print(k);
					k++;
			}
			else
			System.out.print("3");
		}
		System.out.println();
	}
}
}
