class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m1=nums1[0];
        int m2=nums2[0];
        return m2-m1;
    }
}