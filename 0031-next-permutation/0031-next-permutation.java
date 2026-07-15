class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivit=-1;//it can store the index not the val
        // After finding the pivot, the right part is always in descending order.
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivit=i;
                break;
            }
        }
        if(pivit!=-1){
            for(int i=n-1;i>pivit;i--){
            if(nums[i]>nums[pivit]){
                int temp=nums[i];
                nums[i]=nums[pivit];
                nums[pivit]=temp;
                break;
            }
        }
        }
       
        int low=pivit+1;
        int hi=n-1;
        while(low<hi){
            int temp=nums[low];
                nums[low]=nums[hi];
                nums[hi]=temp;
                low++;
                hi--;
        }
        return;
    }
}