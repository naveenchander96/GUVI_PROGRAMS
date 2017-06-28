package basic;
import java.util.Scanner;
public class alphapet {

	public static void main(String[] args) {
        char c;
        Scanner obj=new Scanner(System.in);
        c=obj.next().charAt(0);
        if(c>='a'&&c<='z'||c>='A'&&c<='Z')
        {
        	System.out.println("IT IS A ALPHABET");
        }
        else
        {
        	System.out.println("IT IS NOT A ALPHABET");
        }
        obj.close();
	}
	

}
