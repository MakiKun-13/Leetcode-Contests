/**
 * Total Appeal of A String
 */
class Solution {
    public long appealSum(String s) {
        int[] alphabets = new int[26];
        char ch = 'a';
        for(int i=0; i<26; i++) {
            alphabets[i] = i;
            ch++;
        }
        int sum=0;
        int[][] DP = new int[s.length()][s.length()];
        for(int len=1; len<=s.length(); len++) {
            System.out.println("Len : "+len);
            for(int first=0; first<=s.length()-len; first++) {
                int last = first + len -1;
                if(first == last) {
                    DP[first][last] = alphabets[s.charAt(first) - 'a'];
                    System.out.println("Duh: "+alphabets[s.charAt(first)- 'a']);
                    sum = sum + calculateSum(DP[first][last]);
                    System.out.println(sum);
                    System.out.println("first "+ first+ "last " + last + " "+DP[first][last]);
                }
                else {
                    DP[first][last] = DP[first][last - 1] | alphabets[s.charAt(last)-'a'];
                    System.out.println("DP[first][last - 1]"+DP[first][last - 1]+" | fn: "+ (DP[first][last - 1] | alphabets[s.charAt(last)-'a']) + " alphabets[s.charAt(last)-'a'] :"+alphabets[s.charAt(last)-'a']);
                    System.out.println("first "+ first+ "last " + last + " "+DP[first][last]);
                    sum = sum + calculateSum(DP[first][last]);
                    System.out.println(sum);
                }
            }
        }
        return sum;
    }
    public int calculateSum(int num) {
        int temp =0;
        while(num!=0) {
            temp=temp+(num%10);
            num=num/10;
        }
        return temp;
    }
}