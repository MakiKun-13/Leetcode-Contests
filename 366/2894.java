/**
 * Divisible and Non-divisible Sums Difference
 */
class Solution {
    public int differenceOfSums(int n, int m) {
        int result = 0;
        for(int i=1; i<=n; i++) {
            if(i%m==0)
                result = result-i;
            else
                result = result+i;
        }
        return result;
    }
}