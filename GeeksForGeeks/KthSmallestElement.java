//Link: https://practice.geeksforgeeks.org/problems/kth-smallest-element/0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Select
{
	public static int partition(int[] arr , int low , int high)
	{
		int pivot = arr[high] , pivotloc = arr[low];
		for(int i = low ; i <= high ; i++)
		{
			if(arr[i] < pivot)
			{
				int temp = arr[i];
				arr[i] = arr[pivotloc];
				arr[pivotloc] = temp;
				pivotloc++;
			}
		}
		int temp = arr[pivotloc];
		arr[pivotloc] = arr[high];
		arr[high] = temp;
		return pivotloc;
	}

	public static int kthsmallest(int[] arr , int low , int high , int k)
	{
		if(k > 0 && k <= high - low + 1)
		{
			int partition = partition(arr , low , high);
			if(partition == k)
			{
				return arr[partition];
			}
			else if(partition < k)
				return kthsmallest(arr , partition + 1 , high , k);
			else
				return kthsmallest(arr , low , partition - 1 , k);
		}
		return -1;
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		String[] strArray =  br.readLine().split(" ");
		int[] intArray = new int[n];
		int k = Integer.parseInt(br.readLine());
		for(int temp = 0 ; temp < n ; temp++)
		{
			intArray[temp] = Integer.parseInt(strArray[temp]);
		}
		int[] Array = new int[]{7 , 10 , 4 , 20 , 15};
		int result = kthsmallest(Array , 0 , Array.length , k - 1);
		System.out.println(result);
	}
}
