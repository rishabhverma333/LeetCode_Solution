class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
           int rem=target-nums[i];
           if(set.contains(rem)){
            for(int j=i+1;j<n;j++){
                if(nums[j]==rem){
                    return new int[]{i, j};
                }
            }
           }
        }  
        return new int[]{};  
    }
}