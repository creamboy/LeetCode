public class Solution {
    public int lengthOfLastWord(String s) {
        int lastlen=0;
        int i=s.length()-1;
        while((i>=0)&&s.charAt(i)==' '){
        --i;
        }
        while((i>=0)&&s.charAt(i)!=' '){
            ++lastlen;
            --i;
        }  
        return lastlen;
    }
}
