class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        for(int weight : weights){
            max = Math.max(max, weight);
        }
        int sum = 0;
        for(int weight : weights){
            sum += weight;
        }

        int low = max;
        int high = sum;
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