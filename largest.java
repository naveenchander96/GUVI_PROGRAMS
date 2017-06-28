package basic;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("ENTER THE NUMBER");
		Scanner obj= new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("A IS BIGGER");
		}
		else if(b>a&&b>c)
		{
			System.out.println(" B IS BIGGER");
		}

		else
		{
			System.out.println("C IS BIGGER");
		}
		 obj.close();
	}

}
