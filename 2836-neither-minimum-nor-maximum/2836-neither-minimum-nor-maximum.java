class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int n = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != min && nums[i] != max){
                n = nums[i];
            }
        }
        return n;
    }
}