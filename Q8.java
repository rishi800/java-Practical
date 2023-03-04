//Q8. wap to print all prime no between 1 to 100.
class Q8
{
	public static void main(String args[])
	{
		int i,j,r=0;
		for(i=1;i<=100;i++)
		{
			for(j=2;j<i;j++)
				{
				if(i%j==0)
			    {
					r=i;
					break;
			    }
			}
			if(r==i || i==1)
			{
				System.out.println(i+"is not a prime no");
			}
			else
			{
				System.out.println(i+"is a prime no");
			}
		}
	}
}