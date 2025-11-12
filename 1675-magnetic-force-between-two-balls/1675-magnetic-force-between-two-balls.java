class Solution {
    public int maxDistance(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int ans = -1;
        
        int low = 0;
        int high = stalls[n-1] - stalls[0];
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canWePlaceCow(stalls,mid,k) == true){
                ans = mid;
                low = mid + 1; 
            }else high = mid - 1;
        }
        return ans;
    }
    public static boolean canWePlaceCow(int[] stalls,int dist,int cow){
        int countcow = 1;
        int lastcow = stalls[0];
        
        for(int i = 0; i < stalls.length; i++){
            if(stalls[i] - lastcow >= dist){
                countcow++;
                lastcow = stalls[i];
            }
            if(countcow >= cow) return true;
        }
        return false;
    }
}