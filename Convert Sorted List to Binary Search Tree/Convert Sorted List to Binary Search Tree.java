/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        Return A=ListToBST(head,n);
        return A.t;
    }
    public Return ListToBST(ListNode head, int n){
        if(n==1) return  new Return(new TreeNode(head.val), head.next);
        Return l=ListToBST(head, n/2);
        TreeNode root = new TreeNode(l.l.val);
        root.left=l.t;
        if((n-1)/2!=0){
            Return r=ListToBST(l.l.next, (n-1)/2);
            root.right=r.t;
            return new Return(root, r.l);
        }else{
            return new Return(root, l.l.next);
        }
    }
}
class Return{
    TreeNode t;
    ListNode l;
    Return(TreeNode tree, ListNode list){
        t=tree;
        l=list;
    }
}
