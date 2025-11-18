class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;

        int[] factor = {2,3,5};

        for(int p:factor){
            while(n % p == 0){
               n = n/p;
            }
        }
    return n == 1;
    }
}