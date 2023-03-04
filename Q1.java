//Q1. wap to read a string from user and display it's reverse.
import javax.swing.*;
class Q1
{
    public static void main(String args[])	
    {
		String a;
		a=JOptionPane.showInputDialog("enter string ");
		StringBuffer b=new StringBuffer(a);
		b.reverse();
		System.out.println("old = "+a);
		System.out.println("new = "+b);	
	}
}