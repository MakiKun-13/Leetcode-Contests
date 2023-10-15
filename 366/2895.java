/**
 * Minimum Processing Time
 */
class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks);
        Collections.reverse(tasks);
        int totalTime =0;
        int processor = 0;
        for(int i=0; i<tasks.size(); i=i+4) {
            totalTime =Math.max(totalTime, (tasks.get(i) + processorTime.get(processor)));
            processor++;
        }
        return totalTime;
    }
}