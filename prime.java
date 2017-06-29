import java.util.Scanner;
public class Prime_not {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int count=0;
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		for(b=2;b<a;b++)
		{
			while(a%b==0)
			{
				count=1;
				break;
			}
		}
         if(count==1)
         
        	  System.out.println(" not prime");
        	 
         if(count==0)
  
             	 System.out.println(" prime");
         
         obj.close();
	}
	

}
