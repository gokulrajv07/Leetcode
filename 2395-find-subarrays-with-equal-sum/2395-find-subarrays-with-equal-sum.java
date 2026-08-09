class Solution {
    public boolean findSubarrays(int[] nums) {

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length-1;j++){
                
               int sum1=nums[i]+nums[i+1];
                int sum2=nums[j]+nums[j+1];
                if(sum1==sum2)
                return true;
            }
        }
        return false;
    }
}