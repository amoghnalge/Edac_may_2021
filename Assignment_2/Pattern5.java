class Pattern5
{
	public static void main(String[]args)
	{int a=64;
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
					System.out.print((char)(a+i)+" ");
			}
			System.out.println();
		}
	}
	
}
