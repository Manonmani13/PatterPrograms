package patternapp;

public class Pattern51 {
	public static void main(String[] args) {
		int k=15;
		for(int i=5;i>=1;i--){
			for(int j=5;j>=i;j--) {
				
					System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}
}
