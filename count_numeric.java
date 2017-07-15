import java.util.*;
public class Count_Numeric{

	public static void main(String[] args) {
		String s;
		int count=0;
		System.out.println("ENTER THE NUMBER");
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)>=0&&s.charAt(i)>=9)
		{
			count++;
		}
		}
		System.out.println("THE NUMERIC CHARACTER COUNT OF IS "+count);
	}

}
