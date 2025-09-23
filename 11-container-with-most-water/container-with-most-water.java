class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            //calculate area  = length * width
            //calculate length = min(left, right)
            //calculate width = (right -left)
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}