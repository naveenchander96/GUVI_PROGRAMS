package Player;
import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n;
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
	    System.out.print(a);
	    System.out.print(b);
	    for(int c=0;c<n;c++)
	    {
	    	int ans=a+b;
	    	a=b;
	    	b=ans;
	    	
	    	System.out.print(ans);
	    	
	    }

	}

}
