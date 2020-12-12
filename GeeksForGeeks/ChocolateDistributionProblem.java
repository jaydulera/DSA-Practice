//Link: https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
class ChocolateDistributionProblem
{
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
			int x = Integer.parseInt(br.readLine());
			Arrays.sort(intArray);
			int i = 1;
			int j = x;
			int min = intArray[x - 1] - intArray[0];
			while(j < n)
			{
				if(min > intArray[j] - intArray[i])
					min = intArray[j] - intArray[i];
				i++;
				j++;
			}
			System.out.println(min);
			testCase--;
		}
	}
}
