class Value
{
	int a,b;
	
	void swap(Value r)
	{
		System.out.println("before swap"+"a is"+r.a+"b is "+r.b);
		r.a=r.a+r.b;
		r.b=r.a-r.b;
		r.a=r.a-r.b;
		System.out.println("after swap"+"a is"+r.a+"b is "+r.b);
	}
}
class Call
{
	public static void main(String args[])
	{
		Value s=new Value();
		int a,b;
		s.a=10;
		s.b=20;
		s.swap(s);
		
		
	}
}
