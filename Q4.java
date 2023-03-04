//4. Write a Java program to check if the given number is a prime number.
import javax.swing.*;
class Q4
{
	public static void main(String args[])
	{
	    int num,i,flag=0;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter number"));
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(num+" is not a prime no");
		}
		else
		{
			System.out.println(num+" is a prime no");
		}
	}
}