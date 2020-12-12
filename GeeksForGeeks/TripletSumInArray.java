//Link: https://practice.geeksforgeeks.org/problems/triplet-sum-in-array/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
class TripletSumInArray
{

	static int calc(int[] arr , int n , int targetSum)
	{
		int l, r;
		for(int i = 0 ; i < n - 1; i++)
		{
			l = i + 1;
			r = n - 1; 
			while(l < r)
			{
				if(arr[i] + arr[l] + arr[r] == targetSum)
					return 1;
				else if(arr[i] + arr[l] + arr[r] > targetSum)
					r--;
				else
					l++;
			}
		}
		return 0;
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase > 0)
		{
			String[] strArray = br.readLine().split(" ");
			int n = Integer.parseInt(strArray[0]) , x = Integer.parseInt(strArray[1]);
			String[] strArray1 = br.readLine().split(" ");
			int[] arr1 = new int[n];
			for(int i = 0 ; i < n ; i++)
			{
				arr1[i] = Integer.parseInt(strArray1[i]);
			}
			Arrays.sort(arr1);
			int res = calc(arr1 , n , x);
			System.out.println(res);
			testCase--;
		}
	}
}
