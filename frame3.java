import java.awt.*;
class Labeldemo extends Frame
{
	Labeldemo()
	{
		setTitle("label example");
		Label l1=new Label();
		l1.setBackground(Color.red);
		Label l2=new Label();
		l2.setBackground(Color.blue);
		Label l3=new Label();
		l3.setBackground(Color.green);
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		add(l1);
		add(l2);
		add(l3);
	}
	public static void main(
