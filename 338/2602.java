/**
 * Minimum Operations to Make All Array Elements Equal
 */
class Solution {

    public static List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);
        long[] prefixArr = new long[nums.length];
        prefixArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + nums[i];
        }
        List<Long> list = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            int temp = binarySearch(queries[i], nums);
            long sum1 = 0;
            long sum2;
            if (temp >= 0) {
                sum1 = (long) (temp + 1) * queries[i] - prefixArr[temp];
                sum2 = prefixArr[nums.length - 1] - prefixArr[temp] - (long) queries[i] * (nums.length - (temp + 1));
            } else {
                sum2 = prefixArr[nums.length - 1] - (long) nums.length * queries[i];
            }
            list.add(sum1 + sum2);
        }

        return list;
    }

    public static int binarySearch(int target, int[] nums) {
        int l = 0, r = nums.length - 1, mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (target > nums[mid])
                l = mid + 1;
            else
                r = mid;
        }
        if (nums[l] > target) {
            l--;
        }
        return l;
    }
}