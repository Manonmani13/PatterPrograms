package patter;

public class XStar {
public static void main(String[] args) {
	for(int i=1;i<=18;i++)
	{
		for(int j=i;j<18;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=18;j++)
		{
			if(i==j||j==(18-j))
			System.out.print("*");
			else
				System.out.print(" ");
	
		}
		System.out.println();
	
	}
}
}
