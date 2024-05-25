import java.util.*;
class Account
{
	int acno,a;
	String name;
	int balace;
	Account()
	{
		balace=200;
	}
	void deposit(int x)
	{
		balace=balace+x;
	}
	void balance()
	{
		System.out.println("balance is"+balace);
	}	
	void withdrawl(int y)
	{
		if(balace>y)
		{
			balace=balace-y;
		}	
		else
		{
			System.out.println("withdrawl is not possible check once");
		}
			
	}
}
class Accountdemo
{
	public static void main(String []args)
	{
		Scanner ob=new Scanner(System.in);
		Account s1=new Account();
		int op;
		while(1)
		{
			System.out.println("bank menu");
			System.out.println("1.deposit");
			System.out.println("2.balance");
			System.out.println("3.withdrawl");
			System.out.println("4.exit");
			System.out.println("enter your option");
			op=ob.nextInt();
			switch(op)
			{
				case 1:System.out.println("enter your amount to deposit");
				       int a=ob.nextInt();
				       s1.deposit(a);break;
				case 2:s1.balance();break;
				case 3:System.out.println("enter your amount to withdrawl");
					int b=ob.nextInt();
					s1.withdrawl(b);
				case 4:System.exit();
				default:
					System.out.println("inavalid option");
			}
		}
	}
}



















	
