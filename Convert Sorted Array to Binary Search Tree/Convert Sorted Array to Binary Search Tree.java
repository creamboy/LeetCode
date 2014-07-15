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
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length==0) return null;
        return ArrayToBST(num, num.length);
    }
    public TreeNode ArrayToBST(int[] num, int n){
        if(n==1) return new TreeNode(num[0]);
        if(n==2){
            TreeNode root=new TreeNode(num[1]);
            TreeNode left=new TreeNode(num[0]);
            root.left=left;
            return root;
        }
        int[] numl=new int[n/2];
        int[] numr=new int[(n-1)/2];
        for(int i=0;i<n/2;i++){
            numl[i]=num[i];
        }
        for(int j=n/2+1;j<n;j++){
            numr[j-n/2-1]=num[j];
        }
        TreeNode l=ArrayToBST(numl, n/2);
        TreeNode r=ArrayToBST(numr, (n-1)/2);
        TreeNode root=new TreeNode(num[n/2]);
        root.left=l;
        root.right=r;
        return root;
    }
}
