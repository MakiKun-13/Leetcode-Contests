/**
 * Minimum Consecutive Cards to Pick Up
 */
class Solution {
    public int minimumCardPickup(int[] cards) {
        String cardsString = cards.toString();
        for(int i=0; i<cards.length; i++) {
            if(cardsString.substring(i+1).contains(Integer.toString(cards[i]))) {
                return (cardsString.indexOf(Integer.toString(cards[i]),i+1) - i);
            }
        }
        return -1;
    }
}