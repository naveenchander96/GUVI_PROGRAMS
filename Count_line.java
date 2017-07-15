import java.util.*;
public class Count_line{

	public static void main(String[] args) {
		String s;
		int count=0;
		System.out.println("ENTER THE Line");
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='.')
		{
			count++;
		}
		}
		System.out.println("THE NUMBER OF WORDS IS "+count);
	}

}
