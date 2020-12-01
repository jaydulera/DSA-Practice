//Link: https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
//Solver Function  only
static boolean findsum(int arr[],int n)
{
    int sum = 0;
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0 ; i < n ; i++)
    {
        sum += arr[i];
        if(sum == 0 || arr[i] == 0 || set.contains(sum))
            return true;
        set.add(sum);
    }
    return false;
    //Your code here
}
