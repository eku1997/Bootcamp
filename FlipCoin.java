package com.bridgelab.bootcamp.day2;
import java.util.Scanner;
public class FlipCoin
{
	public static void main(String args[])
	{
		double head=0;
		double tail=0;
		
		int Random;
	
for(int i=0;i<20;i++)
{
	Random=(int)(Math.random()*2);
	
			if(Random==0)
			{
				head++;
			}
			else {
				tail++;
			}	
			}
	double a= (tail/100.0)*100.0;
	double b= (head/100.0)*100.0;
System.out.println("tail="+a+"%");
System.out.println("head="+b+"%");
}
}