class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
         int ans = 0;
        int n = nums.length;
        int left = 0;
        long product = 1;

        for(int rigth = 0; rigth < n; rigth++){
            product *= nums[rigth];
            while(product >= k){
                product /= nums[left];
                left++;
            }
             ans += (rigth- left + 1);
        }
        return ans; 
        
    }
}