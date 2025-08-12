class Solution {
    public int findNumbers(int[] nums) {
         int evenElement = 0;
        for(int i = 0; i<nums.length; i++){
            int numberofdigit = checkdigit(nums[i]);
            if(numberofdigit % 2 == 0){ 
            //help to find whether that element digit count is even/odd 
                evenElement++; 
            }
        }
        return evenElement;
    }    

    // here we count the number of digit in indiviual elment
    public static int checkdigit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
        
}
