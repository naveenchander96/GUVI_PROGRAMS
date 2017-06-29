import java.util.Scanner;
public class Larg_num {

	
	public static void main(String[] args) {
	int a;
	int b;
	int c;
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
	b=obj.nextInt();
	c=obj.nextInt();
	if(a>b&&a>c)
	{
		System.out.println("A IS BIGGRER");
	}
	else if(b>a&&b>c)
	{ 
		System.out.println("B IS BIGGRER");
	}
	else
	{
		System.out.println("B IS BIGGRER");
	}
	obj.close();
	}

}
