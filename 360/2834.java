class Solution {
    public int minimumPossibleSum(int n, int target) {
        if(n==1) {
            return 1;
        }
        int i=1;
        int sum = 0;
        for(int k=0; k<n;) {
            if(i<=target/2) {
                sum = sum + i;
                k++;
            }
            else if(i>=target) {
                sum = sum + i;
                k++;
            }
            i++;
        }
        return sum;
    }
}