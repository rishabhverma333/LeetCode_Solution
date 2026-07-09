class Solution {
    public int findCircleNum(int[][] ans) {
        int n=ans.length;
        int count=0;
        boolean[] visit=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visit[i]){
                bfs(i,visit,ans);
                count++;
            }
        }
        return count;
    }
    void bfs(int i,boolean[] visit,int[][] ans){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        visit[i]=true;
        int n=ans.length;
        while(q.size()>0){
            int pop=q.remove();
            for(int j=0;j<n;j++){
                if(ans[pop][j]==1 && visit[j]!=true){
                    visit[j]=true;
                    q.add(j);
                }
            }
        }
    }
}