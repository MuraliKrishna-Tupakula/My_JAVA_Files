import Measure.Converter;
class Needcon
{
	public static void main(String args[])
	{
		Converter ob=new Converter();
		System.out.println("mm to cm"+ob.MM_CM(250));
		System.out.println("cm  to m"+ob.CM_M(200));
		System.out.println("m to km"+ob.M_KM(1000));
	}
}
