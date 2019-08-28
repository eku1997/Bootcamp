package com.bridgelab.bootcamp.day3;
import java.util.Scanner;

public class Primenumber 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range number:");
System.out.println("r1=");
	int r1=sc.nextInt();
	System.out.println("r2=");
	int r2=sc.nextInt();
	for(int i=r1;i<=r2;i++)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count=count+1;
			
			}
		}
	    if(count==2)
	    {
	    	System.out.println(i+" ");
	    }
		
      }
	}
}
