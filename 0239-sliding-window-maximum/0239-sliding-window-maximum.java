class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int[] ans=new int[n-k+1]; 
        Deque<Integer> dq = new ArrayDeque<>();
        int idx=0;
        for(int i=0;i<n;i++){
            //remove element out of window
           while(!dq.isEmpty() && dq.peekFirst()<=i-k){
            dq.pollFirst();
           }
           //remove element which is smaller becouse use monotonic decressing queue
           while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
            dq.pollLast();
           }
           dq.addLast(i);
           if(i>=k-1){
            ans[idx++]=nums[dq.peekFirst()];
           }
        }
        return ans;
    }
}