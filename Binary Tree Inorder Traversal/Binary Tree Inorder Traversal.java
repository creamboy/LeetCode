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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode temp=root;
        while(!stack.isEmpty()||temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                temp=stack.pop();
                list.add(temp.val);
                temp=temp.right;
                }
        }
        return list;
    }
}
