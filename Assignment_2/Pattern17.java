class Pattern17
{
	public static void main(String[]args)
	{
		int k=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(" "+k);
					++k;
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	
}