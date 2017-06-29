import java.util.Scanner;
public class S2 {

	
	public static void main(String[] args) {
		String s;
		String s3;
		String s4;
		Scanner obj=new Scanner(System.in);
		s=obj.nextLine();
		StringBuffer s2=new StringBuffer(s);
		s2=s2.reverse();
		System.out.println(s2);
		s3=s2.toString();
	s4 = s3.replaceAll("[aeiouAEIOU] ","");
	  System.out.println(s4);
		
	}

}
