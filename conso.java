class Cone
{
	int a,b;
	Cone(int x,int y)
	{
		a=x;
		b=y;
	}	
	void volume()
	{
		double v;
		v=(1.0/3)*3.14*a*a*b;
		System.out.println("volume is "+v);
	}
	
}
class Conedemo
{
	public static void main(String args[])
	{
		
		Cone ob=new Cone(3,4);
		ob.volume();
		
	}
}



