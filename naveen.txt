package Basic;
import java.util.Scanner;
public class Odd_even {


	public static void main(String[] args) {
	int a;
	System.out.println("enter the numbers");
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
	if(a%2==0)
	{
		System.out.println("THE NUMBER IS EVEN");
	}
	else
	{
		System.out.println("THE NUMBER IS ODD");
	}
obj.close();
	}

}
