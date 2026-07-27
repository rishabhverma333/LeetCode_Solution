class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
         return atMostK(nums, k) - atMostK(nums, k - 1);
    }     
    private int atMostK(int[] nums, int k){    
        int n=nums.length;
        int count=0;
        int left=0;
        int right=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<n){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(map.size()>k){
                int first=nums[left];
                map.put(first, map.get(first) - 1);
                if(map.get(first)==0){
                    map.remove(first);
                }
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}