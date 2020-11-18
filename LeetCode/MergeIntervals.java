//Link: https://leetcode.com/problems/merge-intervals/
//Solver function only

class Solution {
    public static int[][] merge(int[][] intervals) {
        
        if(intervals.length < 2)
        {
            return intervals;
        }
        
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));
        
        LinkedList<int[]> result = new LinkedList<>();
        
        for(int[] current : intervals)
        {
            if(result.isEmpty() || result.getLast()[1] < current[0])
            {
                result.add(current);
            }
            else
            {
                result.getLast()[1] = Math.max(result.getLast()[1] , current[1]);
            }
        }
        
        return result.toArray(new int[0][]);
    }
}
