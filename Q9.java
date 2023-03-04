//Q9. wap to print all perfect no between 1 to 100.
class Q9
{
	public static void main(String args[])
	{
		int i,j,sum=0;
		for(i=1;i<=100;i++)
		{	
            sum=0;
			for(j=1;j<=i/2;j++)
			{
				if(i%j==0)
			    {
					sum=sum+j;
			    }
			}
			if(sum==i)
			{
				System.out.println(i+"is perfect no");
			}
			else
			{
				System.out.println(i+"is a not perfect no");
			}
		}
	}
}