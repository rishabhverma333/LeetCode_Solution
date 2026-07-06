class Solution {
    public String longestPalindrome(String s) {
      int n=s.length();
      int[][] dp=new int [n][n];
      int maxlength=0;
      for(int i=0;i<n;i++){
        int row=0;
        for(int col=i;col<n;col++,row++){
            if(s.charAt(row)==s.charAt(col)){
                if(row==col){
                    dp[row][col]=1;
                }
                else if (col == row + 1) {     
                        dp[row][col] = 2;
                }
                else if(dp[row+1][col-1]!=0){
                    dp[row][col]=dp[row+1][col-1]+2;
                }
                maxlength=Math.max(maxlength,dp[row][col]);
            }
        }
    }
        String str="";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]==maxlength){
                    str = s.substring(i, j + 1);
                    break;
                } 
            }
        }
        return str;
    }
}