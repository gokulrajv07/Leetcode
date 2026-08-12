class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       
    Map<Integer, List<Integer>> positions = new HashMap<>();
    int left = 0;
    int maxLen = 0;
    
    for (int right = 0; right < nums.length; right++) {
        positions.computeIfAbsent(nums[right], v -> new ArrayList<>()).add(right);
        
        List<Integer> occurrences = positions.get(nums[right]);
        int count = occurrences.size();
        if (count > k) {
            int indexToExclude = occurrences.get(count - k - 1);
            left = Math.max(left, indexToExclude + 1);
        }
        
        maxLen = Math.max(maxLen, right - left + 1);
    }
    
    return maxLen;
}
    }
