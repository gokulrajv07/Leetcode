class Solution {
    public int uniqueXorTriplets(int[] nums) {
       int n = nums.length;
    if (n <= 2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                for (int k = j; k < n; k++)
                    set.add(nums[i] ^ nums[j] ^ nums[k]);
        return set.size();
    }
    
    int highestBit = 1;
    while (highestBit <= n) highestBit <<= 1;
    return highestBit; 
    }
}