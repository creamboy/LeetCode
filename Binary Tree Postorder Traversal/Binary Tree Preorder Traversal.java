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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode temp=root;
        TreeNode lastvisited=null;
        TreeNode peeknode;
        while(!stack.isEmpty()||temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                peeknode=stack.peek();
                if(peeknode.right!=null&&lastvisited!=peeknode.right){
                    temp=peeknode.right;
                }else{
                    stack.pop();
                    list.add(peeknode.val);
                    lastvisited=peeknode;
                }
            }
        }
        return list;
    }
}
