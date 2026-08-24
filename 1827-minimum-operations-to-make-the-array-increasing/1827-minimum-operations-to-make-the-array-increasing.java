class Solution {
    public int minOperations(int[] nums) {
      int result = 0;
      int temp =0;
      for(int i = 1;i<nums.length;i++){
        if(nums[i]<=nums[i-1]){
            temp = nums[i-1] + 1 - nums[i];
            result += temp;
            nums[i] = nums[i-1]+1;
        }
      }  
      return result;
    }
}