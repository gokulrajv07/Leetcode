class Solution{
    public int missingInteger(int[] nums) {
    int n = nums.length;

    int sum = nums[0];
    int i = 1;
    while (i < n && nums[i] == nums[i - 1] + 1) {
        sum += nums[i];
        i++;
    }
    int maxVal = sum + n;
    boolean[] present = new boolean[maxVal + 2];
    for (int num : nums) {
        if (num >= 0 && num <= maxVal) {
            present[num] = true;
        }
    }
    int x = sum;
    while (x <= maxVal && present[x]) {
        x++;
    }
    
    return x;
}
}