//Link: https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Minimize
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase > 0)
		{
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			String[] strArray = br.readLine().split(" ");
			int[] intArray = new int[n];
			int max = -99999 , min = 99999;
			for(int i = 0 ; i < n ; i++)
			{
				intArray[i] = Integer.parseInt(strArray[i]);
				if(intArray[i] > max)
					max = intArray[i];
				if(intArray[i] < min)
					min = intArray[i];
			}
			System.out.print((max - k) - (min + k));
			testCase--;
		}
	}
}
