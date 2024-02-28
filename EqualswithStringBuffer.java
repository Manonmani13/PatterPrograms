package strings;

public class EqualswithStringBuffer {
public static void main(String[] args) {
	String s1=new String("welcome");
	StringBuffer s2=new StringBuffer("welcome");
	System.out.println(s1.equals(s2));
	System.out.println(s1.contentEquals(s2));
}
}
