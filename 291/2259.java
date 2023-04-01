/**
 * Remove Digit From Number to Maximize Result
 */
class Solution {
    public String removeDigit(String number, char digit) {
        int max = 0;
        for(int i=0; i<number.length(); i++) {
            if(number.charAt(i)==digit && number.charAt(i+1)>number.charAt(i)) {
                return (number.substring(0,i) + number.substring(i+1));
            }
        }
        return (number.substring(0,number.lastIndexOf(digit)) + number.substring(number.substring(number.lastIndexOf(digit))+1));
    }
}