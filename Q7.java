//Q7. Write a program to read roll no, name and marks of three subjects and calculate the total, percentage and division. 

import javax.swing.*;
class Q7
{
	public static void main(String args[])
	{
	    int roll,math,chem,phy;
		String name;
		double total,per;
		
		roll=Integer.parseInt(JOptionPane.showInputDialog("enter roll no"));
		name=JOptionPane.showInputDialog("enter name");
		math=Integer.parseInt(JOptionPane.showInputDialog("enter math. marks"));
		chem=Integer.parseInt(JOptionPane.showInputDialog("enter chem. marks"));
		phy=Integer.parseInt(JOptionPane.showInputDialog("enter phy. marks"));
		
		total=math+chem+phy;
		per=total/3;
		System.out.println("roll no = "+roll);			
		System.out.println("name = "+name);			
		System.out.println("math. marks = "+math);			
		System.out.println("chem. marks = "+chem);			
		System.out.println("phy. marks  = "+phy);			
		System.out.println("total = "+total);
		System.out.println("perchantage = "+per);
		if(per>=60 && per<=100)
		{
			System.out.println("pass by: 1st division");
		}
		else if(per>=45 && per<=59)
		{
			System.out.println("pass by: 2nd division");
		}
		else if(per>=36 && per<=44)
		{
			System.out.println("pass by: 3d division");
		}
		else
		{
			System.out.println("fail");
		}								
	}
} 