class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int firstproduct;
        int lastproduct;
        
        firstproduct = nums[0]*nums[1];
        lastproduct = nums[n-1]*nums[n-2];

        int result = lastproduct-firstproduct;
        return result;
    }
}