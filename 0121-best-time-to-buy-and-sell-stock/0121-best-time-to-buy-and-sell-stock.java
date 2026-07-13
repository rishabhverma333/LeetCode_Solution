class Solution {
    public int maxProfit(int[] arr) {
        int minp=arr[0];
        int maxans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            minp=Math.min(minp,arr[i]);
            maxans=Math.max(maxans,(arr[i]-minp));
        }
        return maxans;
    }
}