class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int max=0;
        int[] leftmax= new int [n];
        int[] rightmax= new int [n];
        //make left max arr
        for(int i=0;i<n;i++){
            max=Math.max(max,height[i]);
            leftmax[i]=max;
        }
        //make right max arr
        max=0;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            rightmax[i]=max;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int min=Math.min(leftmax[i],rightmax[i]);
            ans+=min-height[i];
        }
        return ans;
    }
}