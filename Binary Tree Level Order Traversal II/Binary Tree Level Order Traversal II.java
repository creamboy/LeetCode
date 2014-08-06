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
    List<List<Integer>> result=new ArrayList<>();
    public void DFS(TreeNode root, int level){
        if(root==null) return;
        if(level==result.size()) result.add(new ArrayList<Integer>());
        result.get(level).add(root.val);
        DFS(root.left, level+1);
        DFS(root.right, level+1);
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        DFS(root,0);
        if(result==null){
            return result;
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=result.size()-1;i>=0;i--){
            res.add(result.get(i));
        }
        return res;
    }
}
