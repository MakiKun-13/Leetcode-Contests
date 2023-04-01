/**
 * Number of Even and Odd Bits
 */
class Solution {
    public int[] evenOddBit(int n) {
        int x=0,y=0,counter=0;
        while(n!=0) {
            if(n%2==1) {
                if(counter%2==0)
                    x++;
                else
                    y++;
            }
            n=n/2;
            counter++;
        }
        return new int[] {x,y};
    }
}