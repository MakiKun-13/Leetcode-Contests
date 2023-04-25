/**
 * Prime In Diagonal
 */
class Solution {
    public int diagonalPrime(int[][] nums) {
        int highestPrime= 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(i==j || j==(nums.length -i -1)) {
                    if(isPrime(nums[i][j]) && nums[i][j]>highestPrime) {
                        highestPrime = nums[i][j];
                    }
                }
            }
        }
        return highestPrime;
    }

    public boolean isPrime(int k) {
        if(k==0 || k==1)
            return false;
        for(int i=2; i<=Math.sqrt(k); i++) {
            if(k%i==0)
                return false;
        }
        return true;
    }
}