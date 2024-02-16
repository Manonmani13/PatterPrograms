package numberpattern;

public class PrimeNumberRange {
public static void main(String[] args) {
	int res=0;
	for(int i=1;i<=20;i++)
	{
		for(int j=2;j<i;j++)
		{
			System.out.println(" i%j "+i%j);
			if(i%j!=0)
			{
				res=1;
			}
			else
			{
				res=0;
				break;
			}
		}
		if(res==1)
			System.out.println(i);
	}
	
}
}
