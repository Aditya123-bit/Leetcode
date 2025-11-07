class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n < m*k) return -1;

        int low = minEl(bloomDay, n);
        int high = maxEl(bloomDay, n);
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(possibleans(bloomDay, mid, m, k) == true){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;        
    }
    public static int minEl(int[] bloomDay, int n){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(bloomDay[i] < min){
                min = bloomDay[i];
            }
        }
        return min;
    }
    public static int maxEl(int[] bloomDay, int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(bloomDay[i] > max){
                max = bloomDay[i];
            }
        }
        return max;
    }
    public static boolean possibleans(int[] bloomDay, int day, int m, int k){
        int n = bloomDay.length;
        int count = 0;
        int totalFlower = 0;

        for(int i = 0; i < n; i++){
            if(bloomDay[i] <= day){
                count++;
            }else{
                totalFlower += count/k;
                count = 0;
            }
        }
        totalFlower += count/k;
        return totalFlower >= m;
    }
}