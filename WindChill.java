package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class WindChill {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Ënter T value");
		int t=sc.nextInt();
		System.out.println("Enter V value");
		int v=sc.nextInt();
		if((t>0&&t<=50)&&(v>3&&v<120))
		{
			double w=35.74+0.6215+(0.4275*t-35.75)*Math.pow(v,0.16);
			System.out.println("WindChill="+w);
			
		}
		else {
			System.out.println("invalid input");
		}
		sc.close();
	}

}
