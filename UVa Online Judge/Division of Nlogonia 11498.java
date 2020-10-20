//Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2493
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
		static void calc(int N , int M , int X , int Y)
		{
			if(N == X || M == Y)
				System.out.println("divisa");
			else if(X > N && Y > M)
				System.out.println("NE");
			else if(N > X && M < Y)
				System.out.println("NO");
			else if(N < X && M > Y)
				System.out.println("SE");
			else if(N > X && M > Y)
				System.out.println("SO");
		}
	
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		while(k != 0)
		{
			String nm = br.readLine();
			String[] arrnm = nm.split(" ");
			int n = Integer.parseInt(arrnm[0]);
			int m = Integer.parseInt(arrnm[1]);
			for(int i = 0 ; i < k ; i++)
			{
				String xy = br.readLine();
				String[] arrxy = xy.split(" ");
				int x = Integer.parseInt(arrxy[0]);
				int y = Integer.parseInt(arrxy[1]);
				calc(n , m , x , y);
			}
			k = Integer.parseInt(br.readLine());
		}
	}
}
