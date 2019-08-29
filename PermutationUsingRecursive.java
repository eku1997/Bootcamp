package com.bridgelab.bootcamp.day4;

public class PermutationUsingRecursive 
{
	    //Function for swapping the characters at position I with character at position j  
	    public static String swapString(String a, int i, int j) 
	    {  
	       char[] b =a.toCharArray();  
	       
	        char ch;  
	        ch = b[i];  
	        b[i] = b[j];  
	        b[j] = ch;  
	        return String.valueOf(b);  
	    } 
	      
	    public static void main(String[] args)  
	    {  
	        String str = "ABC";  
	        int len = str.length();  
	        System.out.println("All the permutations of the string are: ");  
	        int start = 0;
			generatePermutation(str,start, len);
	    }  
	      
	
	    public static void generatePermutation(String str, int start, int end)
	    {  
	        //Prints the permutations  
	        if (start == end-1)  
	            System.out.println(str);  
	        else  
	        {  
	            for (int i = start; i < end; i++)  
	            {  
	            	
	                str = swapString(str,start,i);  
	                
	                generatePermutation(str,start+1,end); 
	                
	                str = swapString(str,start,i);  
	            }  
	        }  
	    }  
	  

}

