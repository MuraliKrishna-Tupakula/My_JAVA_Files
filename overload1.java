class Overl
{
	void add(int x, int y)
	{
		System.out.println("addition is "+(x+y));
	}	
	void add(float x,float  y)
	{
		System.out.println("addition is "+(x+y));
	}
	void add(double  x,double y)
	{
		System.out.println("addition is "+(x+y));
	}
}
class Over
{
	public static void main(String args[])
	{
		Overl s=new Overl();
		int x=10,y=20;
		s.add(x,y);
		float a=2.5f,b=4.5f;
		s.add(a,b);
		double p=5.9,q=5.0;
		s.add(p,q);
	}
}
