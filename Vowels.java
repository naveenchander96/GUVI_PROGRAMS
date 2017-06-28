package basic;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		char a;
		Scanner obj=new Scanner(System.in);
		a= obj.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
               System.out.println("ENTER LETTER IS VOWELS");			
		}
		else
		{
			System.out.println("ENTER LETTER IS CONSTANT");
		}
	obj.close();
	}

	

}
