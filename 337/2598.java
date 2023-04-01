/**
 * Smallest Missing Non-negative Integer After Operations
 */
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> map = new TreeMap<> ();
        for(int i=0; i<value; i++) {
            map.put(i,0);
        }

        for(int i=0; i<nums.length; i++) {
            if(nums[i]<0 && nums[i]%value!=0) {
                int var = value+(nums[i]%value);
                map.put(var, map.get(var)+1);
            }
            else {
                int var = nums[i]%value;
                map.put(var, map.get(var) + 1);
            }
        }

        int minValue = Integer.MAX_VALUE, minKey = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()<minValue) {
                minValue = entry.getValue();
                minKey = entry.getKey();
            }
        }
        int mex = value*(minValue) + minKey;
        return mex;
    }
}