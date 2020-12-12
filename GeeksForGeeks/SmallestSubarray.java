//Link: https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class SmallestSubarray
{

	static void calc(int[] arr , int n , int k)
	{
		int left = 0;
		int min = n + 1 , sum = 0;
		for(int right = 0 ; right < n ; right++)
		{
			sum += arr[right];
			while(sum > k && left <= right)
			{
				min = Math.min(min , right - left + 1);
				sum -= arr[left];
				left++;
			}

		}
		System.out.println(min);
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase > 0)
		{
			String[] nAndX = br.readLine().split(" ");
			int n = Integer.parseInt(nAndX[0]);
			int x = Integer.parseInt(nAndX[1]);
			String[] strArray = br.readLine().split(" ");
			int[] intArray = new int[n];
			for(int i = 0 ; i < n ; i++)
			{
				intArray[i] = Integer.parseInt(strArray[i]);
			}
			calc(intArray , n , x);
			testCase--;
		}
	} 
}
