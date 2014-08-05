public class Solution {
   boolean [] isUsed;
    int numLength;
    ArrayList<ArrayList<Integer>> output;
    ArrayList <Integer> al;

    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        numLength = num.length;
        al = new ArrayList <Integer>();
        output = new ArrayList<ArrayList<Integer>>();
        isUsed = new boolean[num.length];
        doPermutation(0, num);
        return output;
    }
    public void doPermutation(int index, int[] num) {
        // base case
        if (index == numLength) {
            output.add((ArrayList<Integer>)al.clone());
            return;
        }
        for (int i = 0; i < numLength; i++) {
            if (!isUsed[i]) {
                al.add(num[i]);
                isUsed[i] = true;
                doPermutation(index + 1, num);
                isUsed[i] = false;
                al.remove(index);
            }
        }
    }
}
