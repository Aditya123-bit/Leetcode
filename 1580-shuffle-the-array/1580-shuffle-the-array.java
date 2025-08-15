class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = nums[i];
        }
        int j = 0;
        for(int i = n; i<nums.length; i++){
            arr2[j] = nums[i];
            j++;
        }

          int[] ans = new int[nums.length];
         int k = 0;
        for(int i = 0; i<n; i++){
            ans[k] = arr1[i];
            ans[k+1] = arr2[i];
            k += 2;
        }
        return ans;
    }
}