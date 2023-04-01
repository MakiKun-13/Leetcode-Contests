/**
 * The Number of Beautiful Subsets
 */
class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : nums) {
            list.add(val);
        }
        Collections.sort(list);
        return findSubsets(0, list, k);
    }

    public int findSubsets(int index, ArrayList<Integer> nums, int k) {
        if(index==nums.size()) {
            if(nums.size()==0)
                return 0;
            int target = nums.get(index-1) - k;
            int l=0, r=index-1, mid = 0;
            while(l<r) {
                mid = l+ (r-l)/2;
                if(nums.get(mid) < target)
                    l = mid + 1;
                else
                    r = mid;
            }
            if(nums.get(l)==target || nums.get(r)==target)
                return 0;
            return 1;
        }
        ArrayList<Integer> withElement = new ArrayList<>(nums);
        int sumWithElement = findSubsets(index+1, withElement, k);

        ArrayList<Integer> withoutElement = new ArrayList<>(nums);
        withoutElement.remove(index);
        int sumWithoutElement = findSubsets(index, withoutElement, k);

        return sumWithElement + sumWithoutElement;
    }



}