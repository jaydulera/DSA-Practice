//Link: https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
//Solver function only
class Solution{
    
    static ArrayList<Integer> result = new ArrayList<>();
    
    static void solve(int[][] matrix , int rowStart , int rowEnd , int columnStart , int columnEnd)
    {
        if(rowStart < rowEnd && columnStart < columnEnd)
        {
            for(int i = columnStart ; i < columnEnd ; i++)
            {
                result.add(matrix[rowStart][i]);
            }
            
            for(int i = rowStart + 1 ; i < rowEnd ; i++)
            {
                result.add(matrix[i][columnEnd - 1]);
            }
            
            if((columnEnd - 1) != columnStart)
            {
                for(int i = columnEnd - 2 ; i >= columnStart ; i--)
                {
                    result.add(matrix[rowEnd - 1][i]);
                }
            }
            
            if((rowEnd - 1) != rowStart)
            {
                for(int i = rowEnd - 2 ; i >= rowStart + 1 ; i--)
                {
                    result.add(matrix[i][columnStart]);
                }
            }
            
            solve(matrix , rowStart + 1 , rowEnd - 1 , columnStart + 1 , columnEnd - 1);
        }
    }
    
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        result.clear();
        solve(matrix , 0 , r , 0 , c);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < r * c ; i++)
            list.add(result.get(i));
        return list;
        // code here 
    }
}
