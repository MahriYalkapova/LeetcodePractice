class Solution {
    public boolean isPalindrome(int x) {
        /**
            If reverse x, the reverse version of x == x
            we will use approach where we don't need to convert int to str
            create variable reverse to keep track of reverse
            we will process digits of x from right to left
            mod operator to get the rightmost digit x%10
            multiply reverse by 10, then increment by digit
            remove rightost digit using division operator
            x = x / 10
            after we process all digits of x, we compare

            sudo code:
            - if x is negative, then false
            - create 2 variables:
            copy, equals to x
            reverse, reverse from of x
            - while copy > 0
            retrieve rightmost digit
            - digit = copy % 10
            - multiply reverse by 10 and increment by digit
            - remove rightmost digit 
            - copy = copy / 10
            - return true if reverse is equal to x
         */

         if (x < 0) return false;

         int reverse = 0, copy = x;
         
         while (copy > 0) {
            int digit = copy % 10;
            reverse = reverse * 10 + digit;
            copy /= 10;
         }

         return reverse == x;
    }
}