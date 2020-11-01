//Link: https://practice.geeksforgeeks.org/problems/kth-smallest-element/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
class Treemap
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String[] strArray = br.readLine().split(" ");
			ArrayList<Integer> map = new ArrayList<Integer>();
			for(int i = 0 ; i < n ; i++)
			{
				map.add(Integer.parseInt(strArray[i]));
			}
			Collections.sort(map);
			System.out.println(map.get(Integer.parseInt(br.readLine()) - 1));
			testCase--;
		}
	}
}
