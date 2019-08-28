package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String args[])
	{
		int base,power;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base ");
		base=sc.nextInt();
		System.out.println("Enter the power ");
		power=sc.nextInt();
	
		for(int i=1;i<=power;i++)
		{
			double val=Math.pow(base, i);
			System.out.println(base+"^"+i+"="+ val);
		}
		
}

}
