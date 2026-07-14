class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxWater=0;
        int low=0;
        int hi=n-1;
        while(hi>=low){
            int minheight=Math.min(height[low],height[hi]);
            int length=hi-low;
            maxWater=Math.max(maxWater,(minheight)*(length));
            if(height[low]<height[hi]) low++;
            else hi--;
        }
        return maxWater;
    }
}