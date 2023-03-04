//Q6. wap to read three numbers from user and display the max no.
import javax.swing.*;
class Q6
{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter 1st value"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter 2nd value"));
		c=Integer.parseInt(JOptionPane.showInputDialog("enter 3d value"));
		if(a>b && a>c)
		{
			System.out.println(a+" is max no");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is max no");
		}
		else if(c>a && c>b)
		{
			System.out.println(c+" is max no");
		}
		else
		{
			System.out.println("equal");
		}
	}
}