package Hunter;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
    int a[]=new int[50];
    int n;
    int f=0;
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
    	for(int j=i+1;j<n;j++)	
    	{
    		if(a[i]==a[j])
    		{  
    	       f=a[i];
    	}                 
    }   break;              
    	
    }       
System.out.println("The first repeating elememt is"+f);
	}
}   