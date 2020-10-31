import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Reverse
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int start = 0 ; start < testCase ; start++)
		{
			String str = br.readLine();
			for(int iter = str.length() - 1 ; iter >= 0 ; iter--)
			{
				System.out.print(str.charAt(iter));
			}
			System.out.println("");
		}
	}
}