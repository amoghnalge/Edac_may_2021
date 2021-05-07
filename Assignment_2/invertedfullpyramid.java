class invertedfullpyramid
{
	public static void main(String[]args)
	{

		
		for(int i=1;i<=9;i++)
	{
		int k=1;
	
		for(int j=1;j<=17;j++)
		{
			if(j>=i & j<=18-i & k==1)
			{
				
				System.out.print("*");
				k=0;
			}
			else
			{
				System.out.print(" ");
				k=1;
				
			}
		}System.out.println();
		
	}

	}
	
}	
	
	
