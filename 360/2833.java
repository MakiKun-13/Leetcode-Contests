/**
 * Furthest Point From Origingit
 */
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0 , right = 0, underscore = 0;
        for(char c: moves.toCharArray()) {
            if(c == 'L') {
                left++;
            }
            else if(c == 'R') {
                right++;
            }
            else {
                underscore++;
            }
        }
        if(left>=right) {
            return (left + underscore) - right;
        }
        else {
            return (right + underscore) - left;
        }
    }
}