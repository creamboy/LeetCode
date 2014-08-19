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
     public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<Integer> stack = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        search(root, sum, stack, res);
        return res;
    }
    public void search(TreeNode root, int sum,ArrayList<Integer> stack, ArrayList<ArrayList<Integer>> res) {
        if (root == null) return;
        stack.add(root.val);
        if ((root.left == null) && (root.right == null)) {
            if (root.val == sum) {
                ArrayList<Integer> ans = new ArrayList<Integer>();
                for (Integer item: stack) ans.add(item);
                res.add(ans);
            }
        } else {
            search(root.left, sum - root.val, stack, res);
            search(root.right, sum - root.val, stack, res);
        }
        stack.remove(stack.size() - 1);
    }

}
