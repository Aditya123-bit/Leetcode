class Solution {
    public void moveZeroes(int[] nums) {
        // from this j pointer we get the zero element index
        int j = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) return;

        for(int i = j+1; i<nums.length; i++){
            if(nums[i] != 0){
                Swap(nums,j,i);
                j++;
            }
        }

    }
    void Swap(int[] arr, int start, int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        
    }
}