class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            st.add(nums[i]);
            st.add(reverse(nums[i]));
        }
        return st.size();
    }
    public static int reverse(int x){
        long ans = 0;

        while(x != 0){
            int last = x % 10;

            ans = ans * 10 + last;

            x = x/10;
        }
        return (int)ans;
    }
}