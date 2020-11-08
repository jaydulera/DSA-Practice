//Link: https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
//Solver Function Only
class solve{

    static int Maximum(int a , int b)
    {
    	if(a > b)
    		return a;
    	else
    		return b;
    }
  
    static int minJumps(int[] arr)
    {
        // your code here
        int previous = 0 , current = 0 , jumps = 0;
        
        if(arr[0] == 0)
        {
            return -1;
        }
        
        if(arr.length == 1)
            return 0;
        
    	for(int i = 0 ; i < arr.length ; i++)
    	{
    		if(i > previous)
    		{
    			jumps += 1;
    			previous = current;
    		}
    		current = Maximum(current , i + arr[i]);
    		if(i == current && current == previous)
    		    return -1;
    	}
    	return jumps;
    }
}
