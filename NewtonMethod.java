package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class NewtonMethod {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of c");
		double c=sc.nextDouble();
		
		double epsilon=1.0e-15;
		double t=c;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		System.out.println(t);
	sc.close();
	}
}
