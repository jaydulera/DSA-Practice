//Link: https://practice.geeksforgeeks.org/problems/array-subset-of-another-array/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
class ArraySubsetOfAnotherArray
{

	static String yesOrNo(HashSet<Integer> set1 , HashSet<Integer> set2)
	{
		for(int element : set2)
		{
			if(!set1.contains(element))
				return "No";
		}
		return "Yes";

	}

	static HashSet<Integer> ArrayToSet(int[] arr , int n)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < n ; i++)
		{
			set.add(arr[i]);
		}
		return set;
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase > 0)
		{
			String[] strArray = br.readLine().split(" ");
			int arr1Length = Integer.parseInt(strArray[0]) , arr2Length = Integer.parseInt(strArray[1]);
			String[] strArray1 = br.readLine().split(" ");
			int[] arr1 = new int[arr1Length];
			for(int i = 0 ; i < arr1Length ; i++)
			{
				arr1[i] = Integer.parseInt(strArray1[i]);
			}
			String[] strArray2 = br.readLine().split(" ");
			int[] arr2 = new int[arr2Length];
			for(int i = 0 ; i < arr2Length ; i++)
			{
				arr2[i] = Integer.parseInt(strArray2[i]);
			}
			HashSet<Integer> set1 = ArrayToSet(arr1 , arr1Length);
			HashSet<Integer> set2 = ArrayToSet(arr2 , arr2Length);
			String res = yesOrNo(set1 , set2);
			System.out.println(res);
			testCase--;
		}
	}
}
