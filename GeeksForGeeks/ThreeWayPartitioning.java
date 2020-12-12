//Link: https://practice.geeksforgeeks.org/problems/three-way-partitioning/1
//Solver function only
class Solution
{
    public void threeWayPartition(int arr[], int a, int b)
    {
        int n = arr.length , temp , i = 0;
        int left = 0 , right = n - 1;
        while(i <= right)
        {
            if(arr[i] < a)
            {
                temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
                i++;
            }
            
            else if(arr[i] > b)
            {
                temp = arr[i];
                arr[i] = arr[right];
                arr[right] = temp;
                right--;
            }
            
            else
                i++;
        }
        // code here 
    }
}
