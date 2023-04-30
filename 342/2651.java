/**
 * Calculate Delayed Arrival Time
 */
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int totalTime = arrivalTime + delayedTime;
        if(totalTime >= 24)
            return totalTime - 24;
        return totalTime;
    }
}