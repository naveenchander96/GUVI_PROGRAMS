import java.util.Scanner;
public class Working_day {

	
	public static String main(String[] args) {
		String s;
		Scanner obj=new Scanner(System.in);
		s=obj.nextLine();
        if(s=="monday"||s=="tuesday"||s=="wednesday"||s=="thusday"||s=="friday"||s=="saturay")
        {
        	return "true";
        } 
        else
        {
        	return "false";
        }
	}

}
