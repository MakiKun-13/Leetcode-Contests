/**
 * Prime Subtraction Operation
 */
class Solution {
    public boolean primeSubOperation(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>max)
                max=nums[i];
        }

        List<Integer> primeNumbers = new ArrayList<>();
        for(int i=2; i<=max; i++) {
            if(isPrime(i))
                primeNumbers.add(i);
        }

        for(int i=0; i<nums.length; i++) {

            int currNum = nums[i];

            for(int p=0; p<primeNumbers.size() && primeNumbers.get(p) < nums[i]; p++) {
                /// for index = 0
                if (i==0 && (nums[i] - primeNumbers.get(p)) <= -1) {
                    break;
                }
                if(i==0 && (nums[i] - primeNumbers.get(p))>0) {
                    currNum = nums[i] - primeNumbers.get(p);
                }


                /// for index > 0
                if (i>0 && (nums[i] - primeNumbers.get(p)) <= nums[i-1]) {
                    break;
                }
                if(i>0 && (nums[i] - primeNumbers.get(p)) > nums[i-1] && (nums[i] - primeNumbers.get(p))>0) {
                    currNum = nums[i] - primeNumbers.get(p);
                }
            }

            if ((i>0 && nums[i-1]>=currNum)) {
                return false;
            }

            nums[i] = currNum;
        }
        return true;
    }


    public boolean isPrime(int n) {
        if(n==0 || n==1 || n==2)
            return true;
        int i=2;
        while(i<=n/2) {
            if(n%i==0)
                return false;
            i++;
        }
        return true;
    }
}