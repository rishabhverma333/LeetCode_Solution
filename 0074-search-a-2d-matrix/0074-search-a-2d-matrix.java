class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m= matrix.length;
       int n=matrix[0].length;
       int row=0;
       for(int i=0;i<m;i++){
        if(matrix[i][n-1]>=target){
            row=i;
            break;
        }
       }
       int left=0;
       int right=n-1;
       if(matrix[row][n-1]==target){
            return true;
        }
       while(left<=right){
        int mid=left+(right-left)/2;
        if(target==matrix[row][mid]){
            return true;
        }
        if(target>matrix[row][mid]){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
       }
       return false;
    }
}