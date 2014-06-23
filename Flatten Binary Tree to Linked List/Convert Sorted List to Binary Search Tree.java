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
    // Keep track of previously visited node
private TreeNode prev = null;

/*
 * Recur version
 */
public void flatten(TreeNode root) {
    TreeNode dummy = new TreeNode(0);
    dummy.right = root;
    prev = dummy;
    flattenHelper(root);
}
public void flattenHelper(TreeNode root){
    if (root == null) return;
    prev.right = root;
    prev.left=null;   //add this line
    prev = root;
    // after invoke flattenHelper on root.left, root.right will revised
    // so record this value
    TreeNode rootRight = root.right;
    flattenHelper(root.left); 
    flattenHelper(rootRight); //
    }
}
