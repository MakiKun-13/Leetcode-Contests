/**
 * Check if a String Is an Acronym of Words
 */
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String acronym = "";
        for(String str: words) {
            acronym += str.charAt(0);
        }
        if(acronym.equals(s)) {
            return true;
        }
        return false;
    }
}