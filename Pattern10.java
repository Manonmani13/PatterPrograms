package patternapp;

public class Pattern10 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++) {
			if(j%2==0)
				System.out.print(i);
			else
				System.out.print(j);
		}
		System.out.println();
	}
}
}
