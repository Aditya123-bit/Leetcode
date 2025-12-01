class Solution {
    public int countDistinctIntegers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            ans.add(num);
        }

        for(int i = 0; i<nums.length; i++){
            ans.add(reverse(nums[i]));
        }

        Set<Integer> st = new HashSet<>();
        for(int it : ans){
            st.add(it);
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