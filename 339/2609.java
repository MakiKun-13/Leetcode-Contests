/**
 * Find the Longest Balanced Substring of a Binary String
 */
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        char[] stringArray = s.toCharArray();
        int maxLength = 0; int length = 0;
        int currentLen = 0, countZeros = 0, countOnes = 0;
        int lastIndexOfOne = Integer.MIN_VALUE;
        for(int c = 0; c < stringArray.length; c++) {
            if(stringArray[c] == '0' && c==lastIndexOfOne+1) {
                currentLen = min(countZeros, countOnes);
                if(currentLen> length)
                    length = currentLen;
                countZeros = 0;
                countOnes = 0;
            }
            if(stringArray[c] == '0')
                countZeros++;
            if(stringArray[c] == '1') {
                lastIndexOfOne = c;
                countOnes++;
            }
        }

        currentLen = min(countZeros, countOnes);
        if(currentLen> length)
            length = currentLen;
        return length*2;
    }

    public int min(int a, int b) {
        if(a<b)
            return a;
        else return b;
    }
}