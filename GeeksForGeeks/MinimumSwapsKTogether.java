//Link: https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MinimumSwapsKTogether
{

	static void solve(int[] arr , int n , int k , int windowSize)
	{
		int localCount = 0;
		for(int i = 0 ; i < windowSize ; i++)
		{
			if(arr[i] > k)
				localCount++;
		}
		int globalCount = localCount;
		int start = 1 , end = windowSize;
		while(end < n)
		{
			if(arr[start - 1] > k)
				localCount--;
			if(arr[end] > k)
				localCount++;
			if(localCount < globalCount)
				globalCount = localCount;
			start++;
			end++;
		}
		System.out.println(globalCount);
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase > 0)
		{
			int n = Integer.parseInt(br.readLine());
			int windowSize = 0;
			String[] strArray = br.readLine().split(" ");
			int[] intArray = new int[n];
			int k = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < n ; i++)
			{
				intArray[i] = Integer.parseInt(strArray[i]);
				if(intArray[i] <= k)
					windowSize++;
			}		
			solve(intArray , n , k , windowSize);
			testCase--;
		}
	}
}
