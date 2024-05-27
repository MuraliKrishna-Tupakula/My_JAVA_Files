class Stat
{
	int rolno;
	String name;
	static String branch;
	Stat (int n,String s)
	{
		rolno=n;
		name=s;
	}
	void display()
	{
		System.out.println("rno is "+rolno +"name is "+name +"branch is "+branch);
	}
}
class  Statdata
{
	public static void main(String args[])
	{
		Stat.branch="cse";
		Stat s1=new Stat(501,"anil");
		Stat s2=new Stat(503,"ram");
		s1.display();
		s2.display();
	}
}
	
