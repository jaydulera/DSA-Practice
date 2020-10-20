//Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2827
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < t ; i++)
		{
			String s = br.readLine();
			String[] ar = s.split(" ");
			int one = Integer.parseInt(ar[0]);
			int two = Integer.parseInt(ar[1]);
			int three = Integer.parseInt(ar[2]);
			if(two >= one && one>= three || three >= one && one>= two)
				System.out.println("Case " + (i + 1) + ": " + one);
			else if(one >= two && two >= three || three >= two && two >= one)
				System.out.println("Case " + (i + 1) + ": " + two);
			else
				System.out.println("Case " + (i + 1) + ": " + three);
		}
	}
}
