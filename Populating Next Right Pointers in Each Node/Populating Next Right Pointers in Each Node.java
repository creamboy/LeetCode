/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode left=root;
        while(left!=null){
            TreeLinkNode across=left;
            while(across!=null){
                if(across.left!=null){
                    across.left.next=across.right;
                }
                if(across.right!=null&&across.next!=null){
                    across.right.next=across.next.left;
                }
                across=across.next;
            }
            left=left.left;
        }
    }
}
