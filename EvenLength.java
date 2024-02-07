package patter;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenLength {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StringTokenizer st=new StringTokenizer(sc.nextLine());
	while(st.hasMoreTokens()) {
		String s=st.nextToken();
		if(s.length()%2==0) {
			System.out.print(s+" ");
		}
	}
}
}
