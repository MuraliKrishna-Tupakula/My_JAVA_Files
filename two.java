import java.util.*;
class Two
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		int add,sub,mul,div,mod;
		System.out.println("enter a value");
		a=s.nextInt();
		b=s.nextInt();
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mod=a%b;
		System.out.println("addition is" +add);
		System.out.println("subtraction is" +sub);
		System.out.println("multiplication is" +mul);
		System.out.println("division is" +div);
		System.out.println("modulo is" +mod);
	}
}
		
