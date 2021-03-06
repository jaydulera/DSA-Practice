//Link: https://leetcode.com/problems/find-the-duplicate-number/
//Solver Function only
class Solution {
    public static int findDuplicate(int[] nums)
	{
		if(nums.length <= 1)
			return -1;
		int fast = nums[0] , slow = nums[0];
		do
		{
			slow = nums[slow];
			fast = nums[nums[fast]];
		}while(slow != fast);

		fast = nums[0];
		while(slow != fast)
		{
			slow = nums[slow];
			fast =  nums[fast];
		}
		return slow;
	}
}
