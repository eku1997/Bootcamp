
public class Quadratic
{
	void findroots(int a,int b,int c)
	{
		if(a==0)
		{
			System.out.println("invalid");
		}
		int d=b*b-4*a*c;
		double sqrt_d=Math.sqrt(d);
		System.out.println("Root1 =" +(-b +sqrt_d/2*a));
		System.out.println("Root2 ="+ (-b-sqrt_d/2*a));
		
	}
	public static void main(String args[])
	{
		Quadratic q=new Quadratic();
		q.findroots(3,8,2);
	}

}
