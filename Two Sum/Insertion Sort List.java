public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> scannedList = new HashMap<Integer, Integer>();
        for(int i = 0; i<numbers.length; i++){
            int tmp = numbers[i];
            if (scannedList.get(target - tmp)!=null){
                res[0] = scannedList.get(target - tmp);
                res[1] = i+1;
                break;
            } else {
                scannedList.put(numbers[i], i+1);
            }
        }
       return res; 
    }
}
