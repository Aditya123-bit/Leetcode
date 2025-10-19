class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
           
            int j = i+1;
            int k = n-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(Math.abs(target - sum) < Math.abs(target - result)){
                    result = sum;
                }
                if(sum == target) return target;
                else if(sum < target){
                    j++;
                }else k--;
                
            }
        }

     return result;   
    }
}
