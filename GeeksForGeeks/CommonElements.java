//Link: https://practice.geeksforgeeks.org/problems/common-elements1132/1
//Solver Function only

class Solution
{
    
    public static int min(int a , int b , int c)
    {
        if(a <= b && a <= c)
            return a;
        else if(b <= a && b <= c)
            return b;
        else
            return c;
    }
    
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int a = 0, b = 0, c = 0;
        boolean flag = true;
        ArrayList<Integer> al = new ArrayList<>();
        while(a < n1 && b < n2 && c < n3)
        {
            if(A[a] == B[b] && B[b] == C[c])
            {
                al.add(A[a]);
                a++;
                b++;
                c++;
            }
            else if(min(A[a] , B[b] , C[c]) == A[a])
            {
                a++;
            }
            else if(min(A[a] , B[b] , C[c]) == B[b])
            {
                b++;
            }
            else
            {
                c++;
            }
        }
        Set<Integer> set = new LinkedHashSet<Integer>(al);
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        return list;
        // code here 
    }
}
