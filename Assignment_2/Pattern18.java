class Pattern18
{
	public static void main(String[]args)
	{
		for(int i=1;i<=5;i++)
		{
			char k='A';
			for(int j=1;j<=5;j++)
			{
				if(j<=6-i)
				{
					System.out.print(" "+(char) (+k));
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