class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0; 
        int right = height.length - 1;

        while(left < right){
            int l = Math.min(height[left], height[right]);
            int b = right - left;
            int current_area = l * b;
            area = Math.max(current_area, area);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return area; 
    }
}