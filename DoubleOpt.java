import java.util.Scanner;
public class DoubleOpt 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an Double");
double a,b,c;
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
double d=(a+(b*c));
double e= (c+(a/b));
double f=((a%b)+c);
System.out.println("calculation");
System.out.println(d);
System.out.println(e);
System.out.println(f);
}
}

