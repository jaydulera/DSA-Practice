//Link: https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1
//Solver function only

class Solution 
{
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) 
    {
        long globalMax = arr[0];
        long localMax = Long.valueOf(arr[0]), localMin = Long.valueOf(arr[0]) , temp;
        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] < 0)
            {
                temp = localMax;
                localMax = localMin;
                localMin = temp;
            }
            
            localMin = Math.min(Long.valueOf(arr[i]) , localMin * Long.valueOf(arr[i]));
            localMax = Math.max(Long.valueOf(arr[i]) , localMax * Long.valueOf(arr[i]));
            
            // if(arr[i - 1] == 0)
            // {
            //     localMin = arr[i];
            //     localMax =  arr[i];
            // }
            
            globalMax = Math.max(globalMax , localMax);
        }
        return globalMax;
        // code here
    }
}
