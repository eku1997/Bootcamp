package com.bridgelab.bootcamp.day3;
import java.util.Scanner;
public class Cos 
{
	static final double PI=3.14;
	static double CosXSertiesSum(double x,int n)
	{
		x=x*(PI/180.0);
		double res=1;
		double sign=1, fact=1, pow=1;
		for(int i=1;i<5;i++)
		{
			sign=sign*-1;
			fact=fact*(2*1-1)*(2*i);
			pow=pow * x * x;
			res=res + sign * pow /fact;
		}
		
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the angle=");
		float x=sc.nextFloat();
		int n =5;
		System.out.println((float)(CosXSertiesSum(x,5)*1000000)/1000000.00);
		sc.close();
	}

}
