package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class GamlingSimulator
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stake");
		int stake=sc.nextInt();
		System.out.println("Enter the Goals");
		int goals=sc.nextInt();
		System.out.println("Enter the trails");
		int trails=sc.nextInt();
		
int bets=0;
int wins=0;
for(int i=1;i<=trails;i++)
{
int cash=stake;

while(cash>0 && cash<goals)
{
	bets++;
	if(Math.random()<0.5) 
	{
		cash++;
	}
	else
	{
		cash--;
	}
}
if(cash==goals) 
{
	wins++;
}
}
System.out.println(wins+"win of:"+trails);
System.out.println("Percantage of game win"+100.0*wins/trails);
System.out.println("Average#bets="+ 1.0*bets/trails);

	}		
}


