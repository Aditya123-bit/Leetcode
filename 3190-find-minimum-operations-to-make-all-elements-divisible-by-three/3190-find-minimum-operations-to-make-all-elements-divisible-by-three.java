class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 3 != 0){
                if(nums[i] > 3){
                    while(nums[i] != 3){
                        nums[i]--;
                    }
                    count++;
                }else{
                    while(nums[i] != 3){
                        nums[i]++;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}