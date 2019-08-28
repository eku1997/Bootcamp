package com.bridgelab.bootcamp.day3;

public class SecondLargestSmallest 
{
	 static void print2Largest(int arr[],int size)
	{
		int i,first,second;
		if(size < 2)
		{
			System.out.print("Invalid Input");
			return;
		}
		first=second=Integer.MIN_VALUE;
		for( i=0;i<size;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
			second=arr[i];
		}
			System.out.println("Second Largest element:"+second);
	}
	 static void print2Smallest(int arr[], int size) 
	 {
		 
		int i,first,second;
		if(size<2)
		{
			System.out.println("Invalid data");
			return;
		}
		first=second=Integer.MAX_VALUE;
		for( i=0;i<size;i++)
		{
			if(arr[i]<first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]<second)
				second=arr[i];
	     }
		System.out.println("Second Smallest element:"+second);
 }
	 public static void main(String[] args) 
	 {
		 int arr[]= {12,35,1,10,34,2};
		 int n=arr.length;
		 print2Largest(arr,n);
		 print2Smallest(arr,n);
     }
 }
		
	
