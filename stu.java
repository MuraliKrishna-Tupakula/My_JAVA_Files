class Student
{
	int rolno,age;
	String name;
	void getdata(int r,String na, int a)
	{
		rolno=r;
		name=na;
		age=a;
	}

	void display()
	{
		System.out.println("rolno is "+rolno);
		System.out.println("name is "+name);
		System.out.println("age  is "+age);
	}
}

class Studemo
{

	public static void main(String []args)
	{
		Student s1=new Student();
		s1.getdata(203,"sai",25);
		Student s2;
		s2=new Student();
		s2.getdata(230,"anil",20);
		s1.display();
		s2.display();
	}
}

