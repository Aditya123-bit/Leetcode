class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> st = new HashSet<>();

        for(int it : nums){
            st.add(it);
        }  
        
        while(st.contains(original)){
            original = 2 *original;
        }

        return original;
    }
}