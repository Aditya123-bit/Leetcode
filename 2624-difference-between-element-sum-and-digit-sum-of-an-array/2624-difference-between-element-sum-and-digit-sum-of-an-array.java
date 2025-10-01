class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitsum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            digitsum += sumOfDigit(nums[i]);
        }
        return sum - digitsum;
    }
    public static int sumOfDigit(int n){
        int sum = 0;
        while (n>0){
        sum += n%10;
        n = n/10;
        }
    return sum;
    }
}