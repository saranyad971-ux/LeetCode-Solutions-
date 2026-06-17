class Solution {
    public String processStr(String s) {
            StringBuilder result = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append(ch);              // lowercase → append
            } 
            else if (ch == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);  // * → remove last
                }
            } 
            else if (ch == '#') {
                result.append(result.toString());              // # → duplicate
            } 
            else if (ch == '%') {
                result.reverse();                              // % → reverse
            }
        }
        
        return result.toString();
    }
}
