//Link: https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Cycle
{
	public static void Rotate(int[] arr , int size)
	{
		int highest = arr[size];
		for(int i = size ; i > 0 ; i--)
		{
			arr[i] = arr[i - 1];
		}
		arr[0] = highest;
		for(int i = 0 ; i <= size ; i++)
		{
			System.out.print(arr[i] + " ");
		}
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
			Rotate(intArray ,  n - 1);
			testCase--;
		}
	}
}
