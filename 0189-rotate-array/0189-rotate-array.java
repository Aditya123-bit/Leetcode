class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length; 
        k=k%n;
       
       int s = 0;
       int e = n-1;

    rev(nums,s,e);  
       rev(nums,s,k-1);
       rev(nums,k,e);
         
    }
    public static void rev(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}