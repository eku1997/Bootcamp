package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class Trigg {
	public static void main(String args[])
	{
		System.out.println("PLease enter the degree");
		Scanner sc=new Scanner(System.in);
		double degree=sc.nextInt();
		double radians=((degree)*(3.14/180));
		System.out.println(radians);
		System.out.println("perform various trigg operation ");
		double cosValue=Math.acos(radians);
		System.out.println("cos value");
		System.out.println(cosValue);
		double sinValue=Math.asin(radians);
		System.out.println("sin value");
		System.out.println(sinValue);
		double tanValue=Math.atan(radians);
		System.out.println("tan value");
		System.out.println(tanValue);

	}

}
