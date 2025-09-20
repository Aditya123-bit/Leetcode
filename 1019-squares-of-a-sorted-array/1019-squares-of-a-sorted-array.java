class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int postion = n-1;

        int[] result = new int[n];

        while(left <= right){
            int leftsquar = nums[left] * nums[left];
            int rightsquar = nums[right] * nums[right];

            if(leftsquar > rightsquar){
                result[postion] = leftsquar;
                left++;
            }else {
                result[postion] = rightsquar;
                right--;
            }
            postion--;
        }
        return result;
    }
}