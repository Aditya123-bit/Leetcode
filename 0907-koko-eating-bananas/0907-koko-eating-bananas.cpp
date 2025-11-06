class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1;
        int high = maxEl(piles);
        int ans = high;

        while(low <= high){
           int mid = low + (high - low)/2;

          long long  totalhr = CalculateTotalhr(piles, mid);
            if(totalhr <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    int maxEl(vector<int>& piles){
        int n = piles.size();
        int el = INT_MIN;

        for(int i = 0; i<n; i++){
            el = max(el,piles[i]);
        }
        return el;
    }
long long  CalculateTotalhr(vector<int>& piles, int k){
        int n = piles.size();
      long long  totalhr = 0;
        for(int i = 0; i<n; i++){
            totalhr += ceil((double)piles[i]/k);
        }
        return totalhr;
    }
};