/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        return helper(root,0);
    }
    
    public int helper(TreeNode root, int x){
        if(root.right==null&&root.left==null) return 10*x+root.val;
        int val=0;
        if(root.left!=null) val+=helper(root.left,10*x+root.val);
        if(root.right!=null) val+=helper(root.right, 10*x+root.val);
        return val;
    }
}
