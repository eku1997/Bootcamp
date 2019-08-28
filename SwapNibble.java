package com.bridgelab.bootcamp.day3;

import java.util.Scanner;
public class SwapNibble
{

	static int swapNibble(int x)
	{
		return((x & 0x0F)<< 4 |(x & 0x0F)>>4);
	}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value=");
	int x=sc.nextInt();
	System.out.print(swapNibble(x));
}
}