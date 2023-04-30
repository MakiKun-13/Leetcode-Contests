/**
 * Sliding Subarray Beauty
 */
class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] resultArr = new int[nums.length-k+1];
        for(int i=0; i<k; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        resultArr[0] = XthMin(map, x);
        for(int i=k; i<nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            map.put(nums[i-k], map.getOrDefault(nums[i-k],0)-1);
            if(map.get(nums[i-k])==0) {
                map.remove(nums[i-k]);
            }
            resultArr[i-k+1] = XthMin(map,x);
        }
        return resultArr;
    }

    private int XthMin(TreeMap<Integer, Integer> map, int x) {
        int smallest = 0;
        for(int val: map.keySet()) {
            if(val<0) {
                smallest += map.get(val);
            }
            else
                return 0;
            if(smallest>=x)
                return val;
        }
        return 0;
    }
}