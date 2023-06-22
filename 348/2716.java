class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (Character c:
                s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}