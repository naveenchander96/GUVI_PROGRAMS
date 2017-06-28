package basic;
import java.util.Scanner;
public class Natural_no {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
	   	c=a+b;
		System.out.println("THE SUM OF NATURAL NUMBERS IS"+c);
		
        obj.close();
	}

}
