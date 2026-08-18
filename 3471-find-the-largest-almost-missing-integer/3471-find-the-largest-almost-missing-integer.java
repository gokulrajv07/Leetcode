class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] subarrayCount = new int[51];
        int n = nums.length;      
        for (int i = 0; i <= n - k; i++) {
            boolean[] seen = new boolean[51];
            for (int j = i; j < i + k; j++) {
                seen[nums[j]] = true;
            }
            for (int v = 0; v <= 50; v++) {
                if (seen[v]) {
                    subarrayCount[v]++;
                }
            }
        }        
        for (int v = 50; v >= 0; v--) {
            if (subarrayCount[v] == 1) {
                return v;
            }
        }    
        return -1;
    }
}