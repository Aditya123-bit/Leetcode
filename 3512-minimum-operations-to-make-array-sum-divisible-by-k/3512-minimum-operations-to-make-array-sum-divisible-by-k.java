class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(sum % k == 0){
                return count;
            }else{
                while(sum % k != 0){
                    sum--;
                    count++;
                }
            }
        }
    return count;    
    }
}