package Q7;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 */

public class Solution {
    public int reverse(int x) {

        int rev = 0;
        int lastDigit;

         while(x != 0) {
             if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
                 return 0;
             }
             lastDigit = x % 10;
             rev = rev *10 + lastDigit;
             x /= 10;
         }
         return rev;
    }
}
