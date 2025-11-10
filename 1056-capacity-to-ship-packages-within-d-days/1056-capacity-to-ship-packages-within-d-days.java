class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = maxEl(weights);
        int high = sumOFWeigths(weights);
        int ans = high;

        while(low <= high){
            int mid = low + (high - low)/2;

            int dayneed = totaldays(weights,mid);

            if(dayneed <= days){
                ans = mid;
                high = mid-1;
            }else {
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
    public static int sumOFWeigths(int[] weights){
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
        }
    return sum;
    }
    public static int totaldays(int[] weights,int capacity){
        int days = 1;
        int load = 0;

        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] > capacity){
                days = days + 1;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return days;
    }
}