package patternapp;

public class Pattern49 {
public static void main(String[] args) {
	int k=9,l=10;
	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++) {
			if(i==j)
			System.out.print(i+" ");
			else if((i+j)%2==1 && (i!=4&& j!=1)|| (i!=5&& j!=2)) {
				System.out.print(k+" ");
				k--;
			}
			else if((i+j)%2==0 ) {
				System.out.print(l+" ");
				l--;
			}
			
		}
		System.out.println();
	}
}
}
