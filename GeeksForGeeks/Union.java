//Link: https://practice.geeksforgeeks.org/problems/union-of-two-arrays/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
class GFG
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase > 0)
		{
			String[] strn = br.readLine().split(" ");
			int[] intn = new int[strn.length];
			for(int i = 0 ; i < strn.length ; i++)
			{
				intn[i] = Integer.parseInt(strn[i]);

			}
			Set<Integer> list = new HashSet<Integer>();
			for(int i = 0 ; i < 2 ; i++)
			{
				String[] strArray = br.readLine().split(" ");
				for(int x = 0 ; x < strArray.length; x++)
					list.add(Integer.parseInt(strArray[x]));
			}
			System.out.println(list.size());
			testCase--;
		}
	}
}
