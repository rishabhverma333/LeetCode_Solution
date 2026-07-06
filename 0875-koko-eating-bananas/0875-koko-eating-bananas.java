class Solution {
    public int minEatingSpeed(int[] w, int h) {
        int n=w.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,w[i]);
        }
        int lo=1;
        int hi=max;
        int speed=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(hours(mid,w)<=h){
                hi=mid-1;
                speed=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return speed;
    }
    long hours(int speed,int[] arr){
        long h=0;
        for(int ele:arr){
            if(ele%speed==0) h+=ele/speed;
            else h+=ele/speed+1;
        }
        return h;
    }
}