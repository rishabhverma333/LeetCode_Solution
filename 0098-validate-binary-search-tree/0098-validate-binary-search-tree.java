/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Triplet{
    long max;
    long min;
    boolean isbst;
    Triplet(long max,long min,boolean isbst){
        this.max=max;
        this.min=min;
        this.isbst= isbst;
    }
 }
class Solution {
    public boolean isValidBST(TreeNode root) {
       return maxmin(root).isbst;
    }
    public Triplet maxmin(TreeNode root) {
        if(root==null) return new Triplet(Long.MIN_VALUE,Long.MAX_VALUE,true);
        Triplet lst=maxmin(root.left);
        Triplet rst=maxmin(root.right);
        long data=(long)(root.val);
        long max=Math.max(data,Math.max(lst.max,rst.max));
        long min=Math.min(data,Math.min(lst.min,rst.min));
        boolean isbst = lst.isbst && rst.isbst && (lst.max < data) && (rst.min > data); 
       return new Triplet(max,min,isbst);
    }
}