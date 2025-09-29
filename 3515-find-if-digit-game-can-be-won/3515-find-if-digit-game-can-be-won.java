class Solution {
    public boolean canAliceWin(int[] nums) {
        int singlesum = 0;
        int doublesum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 10){
                doublesum += nums[i];
            }else {
                singlesum += nums[i];
            }
        }
        if(doublesum == singlesum) return false;
        else return true;
    }
}