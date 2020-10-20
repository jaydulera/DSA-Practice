//Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2113
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] ar;
		String s;
		int[] arr;
		for(int i = 0 ; i < n ; i++)
		{
			s = br.readLine();
			ar = s.split(" ");
			arr = new int[ar.length];
			for(int j = 0 ; j < ar.length ; j++)
			{
				arr[j] = Integer.parseInt(ar[j]);
			}
			if(arr[0] > arr[1])
				System.out.println(">");
			else if(arr[0] < arr[1])
				System.out.println("<");
			else
				System.out.println("=");
		}
	}
}
