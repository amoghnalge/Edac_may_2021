class Fullpyramid
{
	public static void main(String[]args)
	{
		for(int i=1;i<=6;i++)
		{ 
	      int k=1;
			for(int j=1;j<=11;j++)
			{
				
				if(j>=7-i&j<=i+5 &k==1)
				{
					
					System.out.print("*");
				   k=0;
				   
				}
				else{
					System.out.print(" ");
					k=1;
				}
			}System.out.println();
		}
		}
}