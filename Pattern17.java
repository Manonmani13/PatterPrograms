package patternapp;

public class Pattern17 {
public static void main(String[] args) {
	int k=0,m=1;
	for(int i=1;i<=5;i++)
	{
		k=m;
		for(int j=1;j<=5;j++)
		{
			System.out.print(k+" ");
			k+=2;
		}
		m+=2;
		System.out.println();
	}
}
}
