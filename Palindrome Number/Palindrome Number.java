public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }else {
        int reversed = 0;
        int reminder, quotient = x;
        do{
            reminder = quotient % 10;
            quotient = quotient / 10;
            reversed = reversed * 10 + reminder;
            }while(quotient != 0);
        return reversed == x;
        }
    }
}
