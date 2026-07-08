class Solution {
    public List<List<String>> solveNQueens(int n) {
        ArrayList<List<String>> ans=new ArrayList<>();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        return nqueu(0,arr,ans);
    }
    public List<List<String>> nqueu(int r,char[][] arr,ArrayList<List<String>> ans){
        int n=arr.length;
        if(r==n){
            ArrayList<String> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=arr[i][j];
                }
                list.add(str);
            }
            ans.add(list);
            return ans;
        }
        for(int c=0;c<n;c++){
            if(isSafe(r,c,arr)){
            arr[r][c]='Q';
            nqueu(r + 1, arr, ans);
            arr[r][c] = '.';  
            }
        }
        return ans;
    }
    public boolean isSafe(int r,int c,char[][] arr){
        int n=arr.length;
        int i=r-1;
        while(i>=0){  //check up in same col
            if(arr[i][c]=='Q') return false;
            i--;
        }
        i=r-1;
        int j=c-1;
        while(i>=0 && j>=0){  //check left digonal
            if(arr[i][j]=='Q') return false;
            i--;
            j--;
        }
        i=r-1;
        j=c+1;
        while(i>=0 && j<n){  //check right digonal
            if(arr[i][j]=='Q') return false;
            i--;
            j++;
        }
        return true;
    }
}