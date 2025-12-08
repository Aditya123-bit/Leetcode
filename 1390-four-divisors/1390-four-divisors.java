class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;

        for(int i = 0; i<nums.length; i++){
            int count = countDivisor(nums[i]);
            if(count == 4){
               ans += SumOfDivisor(nums[i]);
            }
        }
        return ans;
        
    }
    public static int countDivisor(int n){
        int count = 0; 
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }
        return count;
    }

    public static int SumOfDivisor(int n){
        int sum = 0; 
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                sum += i;
                if(n/i != i){
                    sum += n/i;
                }
            }
        }
        return sum;
    }

}