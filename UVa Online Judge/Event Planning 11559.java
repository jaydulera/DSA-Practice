//Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2595
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Event
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		while(s  != null)
		{	
			int no_of_participants = Integer.parseInt(s[0]);
			int budget = Integer.parseInt(s[1]);
			int no_of_hotels = Integer.parseInt(s[2]);
			int no_of_weeks = Integer.parseInt(s[3]);
			int cost , minimum_cost = 10000,  i , j;
			for(i = 0 ; i < no_of_hotels ; i++)
			{
				int cost_one_person = Integer.parseInt(br.readLine());
				String[] week = br.readLine().split(" ");
				for(j = 0 ; j < no_of_weeks ; j++)
				{
					if(Integer.parseInt(week[j]) >= no_of_participants)
					{
						cost = cost_one_person * no_of_participants;
						if(cost < minimum_cost)
						{
							minimum_cost = cost;
						}
						
					}
				}
			}
			if(minimum_cost < budget)
				System.out.println(minimum_cost);
			else
				System.out.println("stay home");
			s = br.readLine().split(" ");

		}
	}
}
