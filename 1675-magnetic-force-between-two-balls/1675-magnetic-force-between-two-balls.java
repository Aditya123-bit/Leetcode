class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int ans = -1;
        
        int low = 0;
        int high = position[n-1] - position[0];
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canWePlaceball(position,mid,m) == true){
                ans = mid;
                low = mid + 1; 
            }else high = mid - 1;
        }
        return ans;
    }
    public static boolean canWePlaceball(int[] position,int dist,int ball){
        int countball = 1;
        int lastball = position[0];
        
        for(int i = 0; i < position.length; i++){
            if(position[i] - lastball >= dist){
                countball++;
                lastball = position[i];
            }
            if(countball >= ball) return true;
        }
        return false;
    }
}