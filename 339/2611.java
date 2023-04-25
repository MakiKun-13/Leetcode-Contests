/**
 * Mice and Cheese
 */
class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int result = 0;
        Set<Tuple> tuples = new TreeSet<>();
        for (int i = 0; i < reward1.length; i++) {
            Tuple tuple = new Tuple(
                    i,
                    reward1[i] - reward2[i]
            );
            tuples.add(tuple);
        }

        for (Tuple t : tuples) {
            if (k > 0) {
                result += reward1[t.index];
                k--;
            } else {
                result += reward2[t.index];
            }
        }
        return result;
    }
}

class Tuple implements Comparable<Tuple> {
    int index, diff;

    Tuple(int a, int b) {
        index = a;
        diff = b;
    }

    @Override
    public int compareTo(Tuple t) {
        if (t.diff == diff) {
            return t.index - index ;
        }
        return t.diff - diff ;
    }

}
