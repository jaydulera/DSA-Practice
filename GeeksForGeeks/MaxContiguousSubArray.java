//Link: https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Kadane
{
	public static int subarray(int[] arr , int n)
	{
		int maxSoFar = 0 , maxEndingHere = 0;
		for(int i = 0 ; i < n ; i++)
		{
			maxEndingHere = maxEndingHere + arr[i];
			if(maxEndingHere < 0)
				maxEndingHere = 0;
			if(maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;
		}
		return maxSoFar;
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
			int max = -99999;
			for(int i = 0 ; i < n ; i++)
			{
				intArray[i] = Integer.parseInt(strArray[i]);
				if(intArray[i] > max)
					max = intArray[i];
			}
			int result = subarray(intArray , n);
			if(result == 0)
				System.out.println(max);
			else
				System.out.println(result);
			testCase--;
		}
	}
}
