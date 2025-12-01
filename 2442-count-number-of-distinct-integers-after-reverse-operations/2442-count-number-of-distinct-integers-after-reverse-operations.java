class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int num : nums){
            st.add(num);
            st.add(reverse(num));
        }
        return st.size();
    }
    int reverse(int x){
        long ans = 0;

        while(x != 0){
            int last = x % 10;

            ans = ans * 10 + last;

            x = x/10;
        }
        return (int)ans;
    }
}