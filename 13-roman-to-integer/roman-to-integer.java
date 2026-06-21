class Solution {
    public int romanToInt(String s) {
        // Map la ella symbols value store pannu
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        
        int result = 0;
        int prevValue = 0; // munadi paatha value
        
        // 2. String ah kadasi la irundhu munnadi vara paaru
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = map.get(s.charAt(i));
            
            // 3. Chinna value munnadi vandha minus, illana plus
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            
            prevValue = currentValue; // adutha round ku save pannu
        }
        
        return result;
    }
}