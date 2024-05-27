import java.util.*;
class Student
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int rno;
		String name;
		double sgpa;
		System.out.println("enter a name");
		name=s.next();
		System.out.println("enter a rno ");
		rno=s.nextInt();
		System.out.println("enter a sgpa");
		sgpa=s.nextDouble();
		System.out.println("name is " +name);
		System.out.println("rno is " +rno);
		System.out.println("sgpa is " +sgpa);
	}
}
		
