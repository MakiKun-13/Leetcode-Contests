class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int operations = 0;
        if(nums[0] != 0) {
            for(int i=0; i<nums.length; i++) {
                if(nums[i] == 1) {
                    operations += i;
                    swapElementsTillIndex(i, nums);
                    break;
                }
            }
        }
        if(nums[nums.length-1] != nums.length) {
            for(int i=0; i<nums.length; i++) {
                if(nums[i] == nums.length ) {
                    operations += nums.length - i -1;
                    break;
                }
            }
        }
        return operations;
    }

    private void swapElementsTillIndex(int n, int[] nums) {
        for(int i=n; i>0; i--) {
            nums[i] = nums[i-1];
        }
        nums[0] = 1;
    }
}