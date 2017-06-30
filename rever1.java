package guvi;
import java.util.Scanner;
public class rever {

	public static void main(String[] args) {
           int a;
           Scanner obj=new Scanner(System.in);
           a=obj.nextInt();
           while(a!=0)
           {
        	  int  b=a%10;
        	  System.out.print(b);
                a=a/10;
           }
	}

}
