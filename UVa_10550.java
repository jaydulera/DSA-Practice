import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String arr = br.readLine();
    String[] ar = arr.split(" ");
    int[] array = new int[ar.length];
    for(int i = 0 ; i < ar.length ; i++)
    {
      array[i] = Integer.parseInt(ar[i]);
    }
    while(array[0] + array[1] + array[2] + array[3]!= 0)
    {
      int res = 1080 + ((array[0] - array[1] + 40)%40 + (array[0] - array[1] + 40)%40 + (array[0] - array[1] + 40)%40)*9;
      System.out.println(res);
      arr = br.readLine();
      ar = arr.split(" ");
      array = new int[ar.length];
      for(int i = 0 ; i < ar.length ; i++)
      {
        array[i] = Integer.parseInt(ar[i]);
      }
    }
    
  }
}
