class Student
{
	int rolno,age;
	String name;
	student(int rolno)
	{
		this.rolno=rolno;
		
	}
	Student(int rolno,int age)
	{
		this(rolno);
		this.age=age;
		
	}
	Student(int rolno,String name ,int age)
	{
		this(rolno,age);
		this.name=name;
		
	}
		
	void display()
	{
		System.out.println("rolno is "+rolno);
		System.out.println("name is "+name);
		System.out.println("age is "+age);
		
	}
}
class Thisde
{
	public static void main(String []args)
	{
		Student ob=new Student(10,"anil",20);
		ob.display();
	}
}
