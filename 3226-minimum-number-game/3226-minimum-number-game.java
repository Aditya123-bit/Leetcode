class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i = i+2){
            Swap(nums , i , i+1);
        }
        return nums;
    }
    public static void Swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}