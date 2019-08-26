
public class K 
{
public static void main(String args[])
{
	int i,j,k,count=4;
	for(i=0;i<=8;i++)
	{
		for(j=0;j<2;j++)
		{
			System.out.print("*");
		}
	
		for(k=0;k<=count;k++)
		{
			if(k==count)
			{
				System.out.print("***");
			}
			else
			{
				System.out.print(" ");
			}
		}
		if(i<4)
		{
			count--;
		}
		else if(i<9)
		{
			count++;
		}
		System.out.println("");

		}
	}
}
