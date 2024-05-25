import java.util.*;
class Box
{
	int l,b,h;
	void getdata(int x, int y, int z)
	{
		l=x;
		b=y;
		h=z;
	}
	int volume()
	{
		return l*b*h;
	}
}
class Boxdemo
{
	public static void main(String []args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter l,b,h values");
		int l=ob.nextInt();
		int b=ob.nextInt();
		int h=ob.nextInt();
		Box s1=new Box();
		s1.getdata(l, b,h);
		int vol=s1.volume();
		System.out.println("volume is "+vol);
		
		
	}
}

