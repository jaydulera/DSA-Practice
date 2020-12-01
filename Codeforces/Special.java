//https://codeforces.com/contest/1454/problem/A
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Perm
{

	public static void solve(int n)
	{
		int[] res = new int[n];
		res[0] = n;
		for(int i = 1 ; i < n ; i++)
		{
			res[i] = i;
		}
		for(int i = 0 ; i < n ; i++)
			System.out.print(res[i]+" ");
		System.out.println("");
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
			for(int i = 0  ; i < n ; i++)
				intArray[i] = Integer.parseInt(strArray[i]);
			testCase--;
		}
	}
}
