class Solution {
    public int maxArea(int[] heights) {
        int res = 0;

        //to maximize volume we need to maximize width(space between chosen indices) and maximize height(heights[index])
        //width is already maximized by having two pointers start on opposite ends
        //how do we maximize height?
        //we move the pointer with the min height

        int left = 0;
        int right = heights.length - 1;

        while (left < right){
            res = Math.max(res, (right - left) * Math.min(heights[left], heights[right]));

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}
