class Solution {
    public boolean isMonotonic(int[] nums) {
         boolean a = false;boolean b = false;
         for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                a = true;
            }else if(nums[i-1]>nums[i]){
                b = true;
            }
            if(a&&b){
                return false;
            }
            
         }
         return true;
    }
}