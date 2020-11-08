//Link: https://www.codechef.com/NOV20B/problems/ADADISH
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    static int calc(int[] arr , int n)
    {
        if(arr.length == 1)
            return arr[0];
        else if(arr.length == 2)
        {
            if(arr[0] > arr[1])
                return  arr[0];
            else
                return arr[1];
        }
        
        int b1 = arr[n-1] , b2 = arr[n-2];
        for(int i = n - 3 ; i >= 0 ; i--)
        {
            if(b1 > b2)
                b2 += arr[i];
            else
                b1 += arr[i];
        }
        if(b1>b2)
            return(b1);
        else
            return(b2);
    }
    
	public static void main (String[] args) throws java.lang.Exception , IOException
	{
	    try 
	    {
    		// your code goes here
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		int testCase = Integer.parseInt(br.readLine());
    		while(testCase > 0)
    		{
    		    int n = Integer.parseInt(br.readLine());
    		    String[] strArray = br.readLine().split(" ");
    		    int[] intArray = new int[n];
    		    for(int i = 0 ; i < n ; i++)
    		    {
    		        intArray[i] = Integer.parseInt(strArray[i]);
    		    }
    		    Arrays.sort(intArray);
    		    System.out.println(calc(intArray , n));
    		    testCase--;
    		}
		}
		catch(Exception e){}
	}
}
