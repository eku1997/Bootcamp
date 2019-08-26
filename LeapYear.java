
import java.util.Scanner;
public class LeapYear 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter year:");
int year=sc.nextInt();
if(year>=1582)
{
if(((year%400==0)&&(year%100!=0))||(year%400==0))
	{
	System.out.println("leap year");
	}
else
{
	System.out.println("is not a leap year");
	
}
}
else
{
	System.out.println("invalid input");
}
}
}
