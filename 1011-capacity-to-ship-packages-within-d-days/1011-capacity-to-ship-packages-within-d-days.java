class Solution {
    public int shipWithinDays(int[] w, int days) {
        int n=w.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,w[i]);
            sum+=w[i];
        }
        int lo=max;
        int hi=sum;
        int ans=sum;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(day(mid,w)<=days){
                hi=mid-1;
                ans=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    int day(int capacity,int[] arr){
        int c=capacity;
        int days=0;
        for(int ele:arr){
            if(c>=ele){
                c=c-ele;
            }
            else{
                c=capacity-ele;
                days++;
            }
        }
        days++;
        return days;
    }
}