/**
 * Row With Maximum Ones
 */
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] row = new int[mat.length];
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                if(mat[i][j]==1)
                    row[i]+=1;
            }
        }
        int index = 0;
        int max = row[0];
        for(int i=1; i<row.length; i++) {
            if(row[i]>max) {
                max = row[i];
                index = i;
            }
        }
        return new int[] {index, max};
    }
}