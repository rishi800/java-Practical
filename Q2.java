//Q2. wap to read two no from user and swap thier values without using third variable.
class Demo
{
	public static void main(String args[])
	{
		int a=20,b=10;
		System.out.println("old a = "+a);
		System.out.println("old b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("new a = "+a);
		System.out.println("new b = "+b);
	}	
}