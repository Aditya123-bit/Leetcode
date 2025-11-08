class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = maxEl(nums);
        int ans = high;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(getSum(nums,mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
    return ans;    
    }
    public static int maxEl(int[] nums){
        int max = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static int getSum(int[] nums, int divisor){
        int sum = 0;

        for(int i = 0; i<nums.length; i++){
            sum += Math.ceil((double)nums[i]/(double)divisor);
        }
        return sum;
    }
}