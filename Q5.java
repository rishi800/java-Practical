//Q5. wap to calculate area of circle.
import javax.swing.*;
class Q5
{
	public static void main(String args[])
	{
		final double pi=3.14;
		double area;
		int r=Integer.parseInt(JOptionPane.showInputDialog("enter radious"));
		area=pi*r*r;
		System.out.println("area of circle = "+area);
	}
}