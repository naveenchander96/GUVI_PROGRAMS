package guvi;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int a;
		int b;
		int c=1;
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		for(b=1;b<=a;b++)
		{
			c=b*c;
		}
		System.out.println();
	}
	

}
