//Link: https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Negative
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase > 0)
		{
			int positive = 0; 
			int n = Integer.parseInt(br.readLine());
			String[] strArray = br.readLine().split(" ");
			int[] intArray = new int[n];
			for(int i = 0 ; i < n ; i++)
			{
				intArray[i] = Integer.parseInt(strArray[i]);
			}
			for(int i = 0 ; i < n ; i++)
			{
				if(intArray[i] < 0)
				{
					int temp = intArray[i];
					intArray[i] = intArray[positive];
					intArray[positive] = temp;
					positive++;
				}
			}
			for(int i = 0 ; i < n ; i++)
			{
				System.out.print(intArray[i]);
				System.out.print(" ");
			}
			testCase--;
		}
	}
}
