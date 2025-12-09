class Solution {
    public int countOdds(int low, int high) {
        int N = high - low + 1;
        int count = 0;

        if(low % 2 != 0 && high % 2 != 0){
            count = N/2 + 1;
        }else count = N/2;

        return count;
    }
}