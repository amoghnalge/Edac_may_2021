class Pattern11
{
public static void main(String[]args)
{
	for(int i=1;i<5;i++)
	{
		
	
		for(int j=1;j<=10;j++)
		{
			if(j>=6-i & j<=i+4 )
			{
				
				System.out.print("*");
				
			}
			else
			{
				System.out.print(" ");
				
			}
		}System.out.println();
	}
}	
}