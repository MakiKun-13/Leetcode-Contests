/**
 * Minimum Additions to Make Valid String
 */
class Solution {
    public int addMinimum(String word) {
        Stack<Character> stack = new Stack<>();
        for(char c: word.toCharArray()) {
            stack.push(c);
        }
        int count = 0;
        while(!stack.isEmpty()) {
            if(!stack.isEmpty() && stack.peek() == 'c') {
                stack.pop();
            }
            else
                count++;
            if(!stack.isEmpty() && stack.peek() == 'b') {
                stack.pop();
            }
            else
                count++;
            if(!stack.isEmpty() && stack.peek() == 'a') {
                stack.pop();
            }
            else
                count++;
        }
        return count;
    }
}