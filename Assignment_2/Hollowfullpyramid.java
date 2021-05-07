class Hollowfullpyramid
{	
public static void main(String []args)
{
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=12;j++)
		{
			if(i==6||j==7-i||j==i+6)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}System.out.println();
	}
	
}	
}