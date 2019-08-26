import java.util.Random;
public class SumOfTwoDice 
{
public static void main(String args[])
{
	Random r=new Random();
	int die1= r.nextInt(6)+1;
	System.out.println(die1);
	int die2=r.nextInt(6)+1;
	System.out.println(die2);
	int sum= die1+die2;
System.out.println("Sum of Two Radom integer="+ sum);
}
}
