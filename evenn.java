import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner obj=new Scanner(System.in);		
		System.out.println("ENTER THE STARTING NUMBER");
		a=obj.nextInt();	
		System.out.println("ENTER THE ENDING NUMBER");
		b=obj.nextInt();
		for(;a<=b;a++)
		{
			if(a%2==0)
				System.out.println(a);
		}
	}
}