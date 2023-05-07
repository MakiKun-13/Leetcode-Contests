/**
 * Find the Distinct Difference Array
 */
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] resultArray = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            resultArray[i] = findUniqueSum(0,i,nums) - findUniqueSum(i+1, nums.length-1, nums);
        }
        return resultArray;
    }
    public int findUniqueSum(int start, int end, int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        for(int i=start; i<=end; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
                sum++;
            }
        }
        return sum;
    }
}