class Solution {
    public int reverse(int x) {
       int result = 0;
        
        while (x != 0) {
            int digit = x % 10; // Last digit eduthuko
            x = x / 10;         // Last digit remove pannu
            
            // Overflow check: 32-bit range = -2^31 to 2^31-1
            // 2^31-1 = 2147483647, -2^31 = -2147483648
            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || 
               (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            result = result * 10 + digit;
        }
        
        return result;
    }
} 
  