package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class HarmonicNo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Harmonic Series:");
		double sum=0;
	
			for(double i=1;i<=n;i++)
			{
				sum=sum+(1/i);
				System.out.println(sum);
			}

	}
}
