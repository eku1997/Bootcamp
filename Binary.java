package com.bridgelab.bootcamp.day3;
import java.util.Scanner;
public class Binary
{
public static void main(String[] args) 
{
	int a,n,x=0,j=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number=");
	n=sc.nextInt();
	while(n>0)
	{
		a=n%2;
		x=x+(a*j);
		n=n/2;
		j=j*10;
	}
	System.out.println("Binary number="+x);	
}
}
