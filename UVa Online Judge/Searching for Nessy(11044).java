//Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1985
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for(int i = 0 ; i < n ; i++)
    {
      String s = br.readLine();
      String[] ar = s.split(" ");
      int [] arr = new int[ar.length];
      for(int j = 0 ; j < arr.length ; j++)
      {
        arr[j] = Integer.parseInt(ar[j]);
      }
      System.out.println((arr[0]/3)*(arr[1]/3));
    }
  }
}
