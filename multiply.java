import java.util.Scanner;
public class multiply {

	
	public static void main(String[] args) {
	int a;
	int b;
	int c;
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
   for(b=1;b<=10;b++)
    {
	   c=b*a;
	   System.out.println(c);
   }
	}

}
