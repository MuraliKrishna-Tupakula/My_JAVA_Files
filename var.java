class Var
{
	void display(int...ar)
	{
		System.out.println("no.of arguments recevied"+ar.length);
		int i,sum=0;
		for(i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("sum is "+sum);
	}
}
class Varlen
{
	public static void main(String args[])
	{
		Var ob=new Var();
		ob.display();
		ob.display(10);
		ob.display(20,30,40);
		ob.display(50,60,70,80);
	}
}
