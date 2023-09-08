/**
 * Sum of Matrix After Queries
 */
class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        Set<Integer> rowVisited = new HashSet<>();
        Set<Integer> columnVisited = new HashSet<>();
        int row = n;
        int column = n;
        long sum = 0;
        for(int i=queries.length-1; i>=0; i--) {
            int index = queries[i][1];
            int value = queries[i][2];
            if(queries[i][0]==0) {
                if(!rowVisited.contains(index)) {
                    sum += column * value;
                    rowVisited.add(index);
                    row--;
                }
            }
            else {
                if(!columnVisited.contains(index)) {
                    sum += row * value;
                    columnVisited.add(index);
                    column--;
                }
            }
        }
        return sum;
    }
}