class Pattern9
{
public static void main(String[]args)
{
	for(int i=1;i<5;i++)
	{
		int k=1;
		char a='A';
		for(int j=1;j<=10;j++)
		{
			if(j>=6-i & j<=i+4 & k==1)
			{
				
				System.out.print((char) (+a));
				k=0;
				++a;
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