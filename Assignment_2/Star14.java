class Star14
{
	public static void main(String[]args)
	{
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=i&j<=10-i&k==1)
				{
					System.out.print("*");
					k=0;
				}
				else
				{
					System.out.print(" ");
					k=1;
				}
			}
			System.out.println();
		}
		int l=1;
		
		for(int m=1;m<=4;m++)
		{
			for(int n=1;n<=9;n++)
			{
				if(n>=5-m & n<=m+5 &l==1)
				{
					System.out.print("*");
					l=0;
				}
				else
				{
					System.out.print(" ");
					l=1;
				}
			}System.out.println();
		}
		
	}
}