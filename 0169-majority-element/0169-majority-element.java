class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

     int el = 0;
     int count = 0;
     for(int i = 0; i < n; i++){
        if(count == 0){
            el = nums[i];
            count = 1;
        }
        else if(nums[i] == el){
            count++;
        }
        else count--;
     }

     int freq = 0;
     for(int i = 0; i < n; i++){
        if(nums[i] == el){
            freq++;
        }
        if(freq > n/2){
            return nums[i];
        }
     }
        return -1;
    }
}