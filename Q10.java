//Q10. wap to print full pyramid pattern:
//            1
//	        3 2 1
//        5 4 3 2 1
//      7 6 5 4 3 2 1
//    9 8 7 6 5 4 3 2 1
class Q10
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int l=i*2-1;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}