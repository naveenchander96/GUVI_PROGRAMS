import java.util.Scanner;
public class Prime_not {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int count=0;
		Scanner obj=new Scanner(System.in);
	    System.out.println("enter the starting limit");
	    a=obj.nextInt();
	    System.out.println("enter the ending limit");
	    b=obj.nextInt();
		for(;a<=b;a++)
		{
			while(a%2==1)
			{
				System.out.println(a);
				break;
			}
		}	 
         
         obj.close();
	}
	

}
