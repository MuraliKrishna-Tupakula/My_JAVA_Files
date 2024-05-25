import java.util.*;
class Box 
{

	double length=1.0,width=1.0,height=1.0;
	Box( )
	{
	   this.length=1.0;
	   this.width=1.0;
	   this.height=1.0;	
	}
        Box(int le)
	{
		this.length=le;
	}
	Box(int  le,int wi)
	{
		this.length=le;
		this.width=wi;
	}
	Box(int le,int  wi,int hi)
	{
		this.length=le;
		this.width=wi;
		this.height=hi;
	}
	Box(Box o,int hi)
	{
		this.length=o.length;
		this.width=o.width;
		this.height=hi;
	}
	
	double volume()
	 {
		return length*width*height;
	 }
}
class BoxDemo
 {
	public static void main(String args[ ])
	{

	Box b1=new Box();
	Box b2= new Box(10);
	Box b3= new Box(10,20);
	Box b4= new Box(10,20,30);
	Box b5=new Box (b3,40);
	System.out.println("volume of box1 "+b1.volume());
	System.out.println(" volume of box2"+b2.volume());
	System.out.println("volume of box3"+b3.volume());
	System.out.println("volume of box4"+b4.volume());
	System.out.println(" volume of box5"+b5.volume());
	}
}
