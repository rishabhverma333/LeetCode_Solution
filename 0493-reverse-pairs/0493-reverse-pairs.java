class Solution {
    int count=0;
    public int reversePairs(int[] nums) {
       int l=0 ,h=nums.length-1;
        Divide(nums,l,h);
           
    return count; 
    }
    public  void sort(int[] arr1, int left, int mid, int right){
        int j = mid + 1;
         for(int i = left; i <= mid; i++){
            while(j <= right && arr1[i] > 2L * arr1[j]){
                j++;
            }
            count += (j - (mid + 1));
        }
        int[] arr=new int[right - left + 1];
        int i = left;
        j = mid + 1;
        int k = 0;
       
       
        while(i <= mid && j <= right){
            if(arr1[i] <= arr1[j]) arr[k++]=arr1[i++];
            else{
             arr[k++]=arr1[j++];
            }
        }
        while (i <= mid) {
            arr[k++] = arr1[i++];
        }

        while (j <= right) {
            arr[k++] = arr1[j++];
        }
        for (int x = 0; x < arr.length; x++) {
            arr1[left + x] = arr[x];
        }

    }
    public  void Divide(int[] arr,int l,int h){
        if (l >= h) {
            return;
        }
        int mid=l+(h-l)/2;
        Divide(arr,l,mid);
        Divide(arr,mid+1,h);
        sort(arr, l, mid, h);
    }
}