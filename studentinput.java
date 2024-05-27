import java.util.*;
class Student
{
	int rolno;
	String name;
	int s1,s2,s3;
	double sum=0;
	double avg;
	Student(int r,String na, int a,int b,int c)
	{
		rolno=r;
		name=na;
		s1=a;
		s2=b;
		s3=c;
	}

	void displaymarks()
	{
		if(avg>=85)
		{
	
		System.out.println("name is "+name);
		}
		
	}
	void displayname()
	{
		if(name.startsWith("s"))
		{
	
		System.out.println("rolno is "+rolno);
		}
		
	}
}

class Studentdemo
{

	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		Student st[]=new Student[5];
		int i;
		for(i=0;i<st.length;i++)
		{
			System.out.println("enter rolno");
			int r=s.nextInt();
			System.out.println("enter name");
			String na=s.next();
			System.out.println("enter 3 subjects marks");	
			int m1=s.nextInt();
			int m2=s.nextInt();
			int m3=s.nextInt();
			st[i]=new Student(r,na,m1,m2,m3);
			st[i].sum=m1+m2+m3;
			st[i].avg=st[i].sum/3;
		}
		System.out.println("student names avg>=85");
		for(i=0;i<st.length;i++)
		{
			st[i].displaymarks();
		}
		System.out.println("student rolnosstartswith 's'");
		for(i=0;i<st.length;i++)
		{
			st[i].displayname();
		}

			
		
	}
}

