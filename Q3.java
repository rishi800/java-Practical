//3.Write a Java program to check if a vowel is present in a string.

import javax.swing.*;
class Q3
{
	public static void main(String args[])
	{
		String a;
		char b;
		int flag=0;
		a=JOptionPane.showInputDialog("enter string");
		int len=a.length();
		for(int i=0;i<len;i++)
		{
			b=a.charAt(i);
			if(b=='a' || b=='e' || b=='i' || b=='o'|| b=='u' ||b=='A' || b=='E' || b=='I' || b=='O'|| b=='U')
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("all character vowel is present in a string");
		}
		else
		{
			System.out.println("all character consonent is present in a string");
		}
	}
}