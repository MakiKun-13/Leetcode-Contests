/**
 * K Items With the Maximum Sum
 */
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<numOnes)
            return k;

        if(!(numZeros<(k-numOnes)))
            return numOnes;

        int r = k - numOnes - numZeros;
        return (numOnes -r);
    }
}