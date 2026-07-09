class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        boolean[] arr=new boolean[nums.length];
        permutations(nums,arr,a,ans);
        return ans;
    }
    void permutations(int[] nums,boolean[] arr,ArrayList<Integer> a,ArrayList<List<Integer>> ans){
        int n=arr.length;
        if(a.size()==n){
            ArrayList<Integer> copy=new ArrayList<>(a);
            ans.add(copy);
            return;
        }
        for(int i=0;i<n;i++){
            if(!arr[i]){
                a.add(nums[i]);
                arr[i]=true;
                permutations(nums,arr,a,ans);
                a.remove(a.size()-1);
                arr[i]=false;
            }
        }
    }
}