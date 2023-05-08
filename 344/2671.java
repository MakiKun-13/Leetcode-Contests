/**
 * Frequency Tracker
 */
class FrequencyTracker {

    Map<Integer, Integer> numbToFreq;
    Map<Integer, Integer> freqToNum;

    public FrequencyTracker() {
        numbToFreq = new HashMap<>();
        freqToNum = new HashMap<>();
    }

    public void add(int number) {
        if (numbToFreq.containsKey(number)) {
            numbToFreq.put(number, numbToFreq.get(number) + 1);
            freqToNum.put(numbToFreq.get(number)-1, freqToNum.get(numbToFreq.get(number)-1)-1);
            if(freqToNum.get(numbToFreq.get(number)-1)==0)
                freqToNum.remove(numbToFreq.get(number)-1);
            if (freqToNum.containsKey(numbToFreq.get(number))) {
                freqToNum.put(numbToFreq.get(number), freqToNum.get(numbToFreq.get(number)) + 1);
            } else {
                if (freqToNum.containsKey(numbToFreq.get(number)))
                    freqToNum.put(numbToFreq.get(number), freqToNum.get(numbToFreq.get(number)) - 1);
                else {
                    freqToNum.put(numbToFreq.get(number), 1);
                }
            }
        } else {
            numbToFreq.put(number, 1);
            if (freqToNum.containsKey(numbToFreq.get(number)))
                freqToNum.put(1, freqToNum.get(1) + 1);
            else
                freqToNum.put(1, 1);
        }
    }

    public void deleteOne(int number) {
        if (numbToFreq.size() > 0 && numbToFreq.containsKey(number)) {
            freqToNum.put(numbToFreq.get(number), freqToNum.get(numbToFreq.get(number)) - 1);
            if (freqToNum.get(numbToFreq.get(number)) == 0)
                freqToNum.remove(numbToFreq.get(number));
            if (numbToFreq.get(number) > 1) {
                numbToFreq.put(number, numbToFreq.get(number) - 1);
                if (freqToNum.containsKey(numbToFreq.get(number)))
                    freqToNum.put(numbToFreq.get(number), freqToNum.get(numbToFreq.get(number)) + 1);
                else
                    freqToNum.put(numbToFreq.get(number), 1);
            } else
                numbToFreq.remove(number);
        }
    }

    public boolean hasFrequency(int frequency) {
        return freqToNum.containsKey(frequency);
    }
}
/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */