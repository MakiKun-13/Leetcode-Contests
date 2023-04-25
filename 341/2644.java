/**
 * Find the Maximum Divisibility Score
 */
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int[] result = new int[divisors.length];
        for(int i=0; i<divisors.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[j]%divisors[i]==0) {
                    result[i]+=1;
                }
            }
        }
        int index = 0;
        if(divisors.length==1)
            return divisors[0];
        for(int i=0; i<result.length; i++) {
            if(result[i] == result[index]) {
                if(divisors[i]<divisors[index])
                    index = i;
            }
            if(result[i] > result[index])
                index = i;
        }
        return divisors[index];
    }
}