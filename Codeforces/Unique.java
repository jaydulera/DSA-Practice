//https://codeforces.com/contest/1454/problem/B
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Unique
{

	public static void printAns(int[] arr , int n)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == n)
			{
				System.out.print(i + 1);
				break;
			}
		}
	}

	public static void solve(int[] arr , int n)
	{
		TreeMap<Integer , Integer> map = new TreeMap<>();
		for(int i = 0 ; i < n ; i++)
		{
			if(!map.containsKey(arr[i]))
				map.put(arr[i] , 1);
			else
			{
				map.put(arr[i] , map.get(arr[i]) + 1);
			}
		}
		if(!map.containsValue(1))
			System.out.print(-1);
		else
			for(Map.Entry<Integer , Integer> e : map.entrySet())
			{
				if(e.getValue() == 1)
				{
					printAns(arr , e.getKey());
					break;
				}
			}
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
			solve(intArray , n);
			testCase--;
		}
	}
}
