class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0;
        int h = n-1;
        int max = 0;
        while(l < h){
            int area = (h-l) * Math.min(heights[l], heights[h]);
            max = Math.max(area, max);
            if(heights[l] < heights[h]){
                l++;
            }
            else{
                h--;
            }

        }
        return max;
    }
}
