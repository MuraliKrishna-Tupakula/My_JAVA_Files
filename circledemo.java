import java.util.*;
class Circle
{
	int r;
	void area(int x)
	{
		double a=3.14*x*x;
		System.out.println("area of circle is"+a);
	}	
	void perimeter(int y)
	{
		double b=2*Math.PI*y;
		System.out.println("perimeter of circle is"+b);
	}
}
class Circledemo
{
	public static void main(String []args)
	{
		Circle ob=new Circle();
		ob.area(4);
		ob.perimeter(4);
	}
}	
	
	
