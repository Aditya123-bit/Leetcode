class Solution {
    public int maximumWealth(int[][] accounts) {
    int maxWealth = 0;
        for(int i = 0; i<accounts.length; i++){
            int accountsum = 0;
                for(int j = 0; j < accounts[i].length; j++){
                    accountsum += accounts[i][j];
                }
            if(accountsum > maxWealth){
                maxWealth = accountsum;
            }    
        }
        return maxWealth;
    }
}