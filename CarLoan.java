package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class CarLoan {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Principal Loan");
		double P=sc.nextDouble();
		System.out.println("Year");
		double Y=sc.nextDouble();
		System.out.println("Interest");
		double R=sc.nextDouble();
		double n=12*Y;
		double r=R/(12*100);
		double payment=(P*r)/(1-Math.pow(1+r, -n));
		double interest=payment*n-P;
		System.out.println("Monthly payment="+payment);
		System.out.println("Total interest="+interest);
	}

}
