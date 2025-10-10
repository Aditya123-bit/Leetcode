class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        int count1 = 0;
        int el1 =  Integer.MIN_VALUE;
        int count2 = 0;
        int el2 =  Integer.MIN_VALUE;
        int min = n/3 +1;

        for(int i = 0; i<n; i++){
            if(count1 == 0 && nums[i] != el2){
                el1 = nums[i];
                count1 = 1;
            }
           else if(count2 == 0 && nums[i] != el1){
                el2 = nums[i];
                count2 = 1;
            }
            else if(el1 == nums[i]){
                count1++;
            }
            else if(el2 == nums[i]){
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
         count2 = 0;
        for(int i = 0; i<n; i++){
            if(el1 == nums[i]) count1++;
            if(el2 == nums[i]) count2++;
        }
        if(count1 >= min){
            ls.add(el1);
        }
         if(count2 >= min){
            ls.add(el2);
        }
        return ls;
    }
}