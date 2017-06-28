package basic;
import java.util.Scanner;
public class Natural_no {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		for(b=0;b<=5;b++)
        {
            c=b+a;
        }
        System.out.println(b);
        obj.close();
	}

}
