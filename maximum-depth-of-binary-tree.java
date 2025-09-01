// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int maxDepth(TreeNode root) {
//         if(root==null) return 0;
//         if(root.left==null && root.right==null) return 1;
//         return Math.max(dfs(root.left,1),dfs(root.right,1));
//     }
//     public int dfs(TreeNode root,int len)
//     {
//         if(root==null) return len-1;
//         if(root.left==null && root.right==null) return len;
//         int left=len;
//         int right=len;
//         if(root.left!=null){
//         left=dfs(root.left,len+1);
//         }
//         if(root.right!=null){
//         right=dfs(root.right,len+1);
//         }
//         return Math.max(left,right);
//     }
// }

// too much code lines ;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
   
}
