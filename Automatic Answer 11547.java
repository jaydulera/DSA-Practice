//Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2542
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
class Automatic
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < t ; i++)
		{
			int n = Integer.parseInt(br.readLine());
			int res = Math.abs((((((n * 567)/9 + 7492)*235)/47 -498)/10)%10);
			System.out.println(res);
		}
	}
}
