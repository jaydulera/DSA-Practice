//Link: https://practice.geeksforgeeks.org/problems/trapping-rain-water/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class TrappingRainWater
{

	static void calc(int[] arr , int n)
		{
			int[] left = new int[n];
			int[] right = new int[n];
			left[0] = arr[0];
			for(int i = 1 ; i < n ; i++)
			{
				left[i] = Math.max(left[i - 1] , arr[i]);
			}
			right[n - 1] = arr[n - 1];
			for(int i = n - 2 ; i >= 0 ; i--)
			{
				right[i] = Math.max(right[i + 1] , arr[i]);
			}
			int res = 0;
			for(int i = 0 ; i < n ; i++)
			{
				res += Math.min(left[i] , right[i]) - arr[i];
			}
			System.out.println(res);
		}


	public static void main(String[] args) throws IOException
	{

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
			calc(intArray , n);
			testCase--;
		}
	}
}
