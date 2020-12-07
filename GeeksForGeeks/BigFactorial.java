//Link: https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers/0#
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
class Factorial
{

	static void fact(int n)
	{
		while(top <= n)
		{
			res = BigInteger.valueOf(top).multiply(list.get(top - 1));
			list.add(res);
			top++;
		}
		System.out.println(list.get(top - 1));
	}

	static ArrayList<BigInteger> list = new ArrayList<>();
	static int top = 0;
	static BigInteger res = BigInteger.valueOf(1);
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		list.add(BigInteger.valueOf(0));
		list.add(BigInteger.valueOf(1));
		top += 2;
		while(testCase > 0)
		{
			int n = Integer.parseInt(br.readLine());
			if(n < top)
				System.out.println(list.get(n));
			else
				fact(n);
			testCase--;
		}
	}
}
