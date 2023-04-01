/**
 * Check Knight Tour Configuration
 */
class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        int[] x = new int[n*n];
        int[] y = new int[n*n];
        if(grid[0][0]!=0)
            return false;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                x[grid[i][j]] = i;
                y[grid[i][j]] = j;
            }
        }
        for(int k=1; k<n*n; k++) {
            float l = x[k]-x[k-1];
            if(Math.abs((l/(y[k]-y[k-1])))!=0.5 && Math.abs((l/(y[k]-y[k-1])))!=2.0) {
                return false;
            }
        }
        return true;
    }
}