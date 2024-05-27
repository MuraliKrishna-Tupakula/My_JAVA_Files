class Value
{
	
	void swap(int a,int b)
	{
		System.out.println("before swap"+"a is"+a+"b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
	}
}
class Callv
{
	public static void main(String args[])
	{
		Value s=new Value();
		int a=10,b=20;
		
		s.swap(a,b);
		System.out.println("after swap"+"a is"+a+"b is "+b);
		
	}
}

