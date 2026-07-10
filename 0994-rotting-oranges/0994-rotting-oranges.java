class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    int count;
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        count=0;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
            }
        }
        while(q.size()>0){
             int size = q.size();
             boolean rotten = false;
            for (int i = 0; i < size; i++) {
            Pair pop = q.remove();
            if(pop.row+1 < n &&grid[pop.row+1][pop.col]==1){
                grid[pop.row+1][pop.col] = 2;
                rotten=true;
                q.add(new Pair(pop.row+1,pop.col));
            }
            //up
            if(pop.row-1>=0 &&grid[pop.row-1][pop.col]==1){
                grid[pop.row-1][pop.col] = 2;
                rotten=true;
                q.add(new Pair(pop.row-1,pop.col));
            }
            //right
            if(pop.col+1<m &&grid[pop.row][pop.col+1]==1){
                grid[pop.row][pop.col+1] = 2;
                rotten=true;
                q.add(new Pair(pop.row,pop.col+1));
            }
            //left
            if(pop.col-1>=0 &&grid[pop.row][pop.col-1]==1){
                grid[pop.row][pop.col-1] = 2;
                rotten=true;
                q.add(new Pair(pop.row,pop.col-1));
            }
            }
            if(rotten) count++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }            
        return count;
    } 
}