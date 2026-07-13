class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>n/2)
            return nums[i];
        }
        return -1;
    }
}