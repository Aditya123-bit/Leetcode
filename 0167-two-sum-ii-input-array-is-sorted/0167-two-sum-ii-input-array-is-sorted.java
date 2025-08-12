class Solution {
    public int[] twoSum(int[] num, int target) {
        int s = 0;
        int e = num.length-1;

        while(s < e){
            int sum = num[s] + num [e];

            if(sum == target){
                return new int[]{s+1 , e+1};
            }else if(sum < target){
                s++;
            }else{
                e--;
            }    
        }
        return new int[]{};
    }
}