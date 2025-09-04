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
    public boolean isValidBST(TreeNode root) {
        if(root==null){ return true;}
        TreeNode traNode=cbbst(root);
        if(root==traNode)
        {
            return true;
        }
        else
        return false;
        
    }
    public TreeNode cbbst(TreeNode root)
    {
        if(root==null || (root.left==null && root.right==null))
        {
            return root;
        }
        TreeNode left=cbbst(root.left);
        TreeNode right=cbbst(root.right);
        if(left!=null && right !=null && left.val<root.val && root.val<right.val)
        {
            return root;
        }
        return new TreeNode();
    }
}

why the above will not work is 
1.if one node is null it garbage value
2.i am checking immediate left and right nodes with root BST allnodes on LEFT<root<allnodes of right
so it should in range 

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
    public boolean isValidBST(TreeNode root) {
        return cbbst(root,LONG.MIN_VALUE,LONG.MAX_VALUE);        
    }
    public TreeNode cbbst(TreeNode root,long min,long max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val<=min || root.val>=max)
        {
            return false;
        }
        return cbbst(root.left,min,root.val) && cbbst(root.right,root.val,max);
    }
}