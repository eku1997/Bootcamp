package com.bridgelab.bootcamp.day2;

public class TemperatureConversion
{
	public static void main(String args[])
	{ 
		fahrenheit(5);
		clecius(4);
		
	}
		public static void fahrenheit(int n)
		{
			int f= (n* 9/5) + 32 ;
			System.out.println("Fahrenheit of "+n +"is ="+f );
		}
		public static void clecius(int n)
		{
			int c=(n-32) * 5/9 ;
			System.out.println("Clecius of"+ n +"is ="+c);
		}
	}


