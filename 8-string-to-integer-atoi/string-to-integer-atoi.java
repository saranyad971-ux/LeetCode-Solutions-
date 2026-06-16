class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int i = 0, n = s.length();
        int sign = 1;
        long result = 0; // overflow check panna long use panrom, but return int dhan
        
        // Step 1: Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // Step 2: Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        // Step 3: Convert digits and handle overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            
            // Step 4: Rounding - check 32-bit overflow
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE; // 2147483647
            }
            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE; // -2147483648
            }
            i++;
        }
        
        return (int)(sign * result);
    }
}