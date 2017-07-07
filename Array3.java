package Hunter;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
    int a[]=new int[50];
    int n;
    int count=0;
    Scanner in=new Scanner(System.in);
    System.out.println("enter the array size");
    n=in.nextInt();
    for(int i=0;i<n;i++)
    {
    	a[i]=in.nextInt(); 	
    }
    for(int i=0;i<n;i++)
    {   
    	for(int j=0;j<n;j++)	
    	{
    		
    		if(a[i]==a[j])
    		{
    			count++;
    		}
    	}
         if(count==1)
         {
        	 System.out.println("The NON repeating elememt is"+a[i]);          	
         }
    }
	}
}          