import java.util.*;
class Complex
{
	double real,imag;
	
	void setreal(double r)
	{
		real=r;
	}
	void setimag(double i)
	{
		imag=i;
	}		
	double getreal()
	{
		return real;
	}
	double getimag()
	{
		return imag;
	}
	void display()
	{
		System.out.println(real+"+i"+imag);
	}
	Complex add(Complex c1,Complex c2)
	{
		Complex c3=new Complex();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		return c3;
	}
	Complex sub(Complex c)
	{
		Complex c3=new Complex();
		c3.real=real-c.real;
		c3.imag=imag-c.imag;
		return c3;
	}
	
}
class Complexdemo
{
	public static void main(String args[])
	{
	  Scanner s= new Scanner(System.in);
		double r,i;
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3=new Complex();
		System.out.println("enter real&imag of part1");
		r=s.nextDouble();
		i=s.nextDouble();
		c1.setreal(r);
		c1.setimag(i);
		c1.display();
		System.out.println("enter real&imag of part2");
		r=s.nextDouble();
		i=s.nextDouble();
		c2.setreal(r);
		c2.setimag(i);
		c2.display();
		c3=c3.add(c1,c2);
		c3.display();
		c3=c1.sub(c2);
		c3.display();
	}
}


