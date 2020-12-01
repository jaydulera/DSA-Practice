//Link: https://leetcode.com/problems/next-permutation/
//Solver Function only
import java.util.*; 
class Solution {
    
    public static int findPivot(int[] nums)
    {
        int pivot = -1;
        for(int i = nums.length - 1 ; i > 0 ; i--)
        {
            if(nums[i] > nums[i - 1])
            {
                pivot = i - 1;
                break;
            }
        }
        return pivot;
    }
    
    public static int getReplacement(int[] nums , int pivot)
    {
        for(int i = nums.length - 1 ; i >= pivot ; i--)
        {
            if(nums[i] > nums[pivot])
                return i;
        }
        return pivot;
    }
    
    public static int[] swap(int[] nums , int pos1 , int pos2)
    {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
        return nums;
    }
    
    public static int[] reverse_arr(int[] nums , int pivot)
    {
        int x = nums.length - 1;
        int i = pivot + 1;
        while(i > x)
        {
            nums = swap(nums , i , x);
            x--;
            i++;
        }
        return nums;
    }
    
    public void nextPermutation(int[] nums) {
        if(nums.length < 2)
        {
            System.out.println(nums);
        }
        else
        {
            int pivot = findPivot(nums);
            if(pivot == -1)
            {
                nums = reverse_arr(nums , -1);
                System.out.println(nums); 
            }
            else
            {
                int replacement = getReplacement(nums , pivot);
                nums = swap(nums , pivot , replacement);
                nums = reverse_arr(nums , pivot);
                System.out.println(nums);
            }
        }
    }        
}
