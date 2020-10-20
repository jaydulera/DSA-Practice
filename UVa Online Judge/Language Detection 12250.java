//Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3402
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Language
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int i = 1;
		while(!"#".equals(s))
		{
			if(s.equals("HELLO"))
				System.out.println("Case " + i + ": ENGLISH");
			else if(s.equals("HOLA"))
				System.out.println("Case " + i + ": SPANISH");
			else if(s.equals("HALLO"))
				System.out.println("Case " + i + ": GERMAN");
			else if(s.equals("BONJOUR"))
				System.out.println("Case " + i + ": FRENCH");
			else if(s.equals("CIAO"))
				System.out.println("Case " + i + ": ITALIAN");
			else if(s.equals("ZDRAVSTVUJTE"))
				System.out.println("Case " + i + ": RUSSIAN");
			else
				System.out.println("Case " + i + ": UNKNOWN");
			s = br.readLine();
			i += 1;
		}
	}
}
