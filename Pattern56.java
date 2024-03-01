package patternapp;

public class Pattern56 {
public static void main(String[] args) {
	int k=4;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(j==1)
				System.out.print(i+" ");
			else {
				System.out.print(i+k-j+" ");
				k--;
			}
		}
		System.out.println();
		k=4;
	}
}
}
