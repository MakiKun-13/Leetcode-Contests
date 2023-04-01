/**
 * K Divisible Elements Subarrays
 */
class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<String> set = new HashSet<String>();
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                int count = 0;
                String substring = "";
                for(int n=i; n<=j; n++) {
                    substring += nums[n];
                    if(n%p == 0) {
                        count++;
                    }
                    if(count>k)
                        break;
                }
                if(count<=k) {
                    set.add(substring);
                }
            }
        }
        return set.size();
    }
}