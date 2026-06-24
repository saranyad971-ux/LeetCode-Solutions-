class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Early termination: min sum > 0 aana break
            if (nums[i] > 0) break;
            
            // Skip duplicate for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i]; // nums[left] + nums[right] = -nums[i]
            
            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for right 
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < target) {
                    left++; // Need bigger sum
                } else {
                    right--; // Need smaller sum
                }
            }
        }
        return res;
    }
} 