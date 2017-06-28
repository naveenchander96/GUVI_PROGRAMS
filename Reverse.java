package Guvi;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
	String s1;
	Scanner obj=new Scanner(System.in);
	s1=obj.nextLine();
	 StringBuffer s2=new StringBuffer(s1);
	 s2=s2.reverse( );
	System.out.println(s2);
	}

}
