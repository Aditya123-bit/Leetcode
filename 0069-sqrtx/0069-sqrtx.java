class Solution {
    public int mySqrt(int x) {
      if(x <= 0) return 0;  
      int low = 1; 
      int high = x;
      int ans = 1;

      while(low <= high){
        int mid = low + (high - low)/2;
        long val = (long) mid * mid;

        if(val <= x){
            ans = mid;
            low = mid + 1;
        }else{
            high = mid - 1;
        }

      }
     return ans;   
    }
}