//Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2349
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Parking
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int I = 0 ; I < T ; I++)
		{
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			int min = 99, max = 0;
			String[] ar = s.split(" ");
			int[] arr = new int[n];
			for(int i = 0 ; i < n ; i++)
			{
				arr[i] = Integer.parseInt(ar[i]);
				if(arr[i] > max)
				{
					max = arr[i];
				}
				if(arr[i] < min)
				{
					min = arr[i];
				}
			}
			System.out.println((max - min)*2);
		}
	}
}
