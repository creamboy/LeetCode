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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0) return null;
        int indexpost=postorder.length-1;
        int indexin=inorder.length-1;
        Stack<TreeNode> parent=new Stack<TreeNode>();
        TreeNode root=new TreeNode(postorder[indexpost]);
        indexpost--;
        TreeNode cur=root;
        while(indexpost>=0){
            while(cur.val!=inorder[indexin]){
                parent.push(cur);
                cur.right=new TreeNode(postorder[indexpost]);
                indexpost--;
                cur=cur.right;
            }
            if(indexpost<0) break;
            indexin--;
            while(parent.size()>0&&parent.peek().val==inorder[indexin]){
                indexin--;
                cur=parent.pop();
            }
            cur.left=new TreeNode(postorder[indexpost]);
            indexpost--;
            cur=cur.left;
        }
        return root;
    }
}
